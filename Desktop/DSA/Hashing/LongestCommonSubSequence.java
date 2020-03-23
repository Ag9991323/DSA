package Hashing;
import java.util.*;
class LongestCommonSubsequence{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
            h.add(arr[i]);
        }
        
        int res=0;
       
       
        for(int i=0;i<n;i++){
            if(!h.contains(arr[i]-1)){
               int  curr=1;
               while(h.contains(arr[i]+curr)){
                   curr++;
               }

               res=Math.max(res,curr);
            }
          
          
        }
        System.out.println(res);
    }
}