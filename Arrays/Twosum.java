
package Arrays;

import java.util.*;
class  TwoSum{

      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          Solution s = new Solution();
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
         int arr1[]= s.twoSum(arr, 6);  
         System.out.println(Arrays.toString(arr1));   
          }
   }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hset = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hset.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
                if(hset.get(nums[i])==i){
                    hset.remove(nums[i]);
                }
                
                if(hset.containsKey(target-nums[i])){
                    int arr[]= { i,hset.get(target-nums[i])};
                    return arr;
                }
                hset.put(nums[i],i);
        }
        int arr[]= {0 ,0 };
        return arr ;
    }
}