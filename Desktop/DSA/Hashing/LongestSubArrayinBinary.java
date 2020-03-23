package Hashing;
import java.util.*;
class BinaryArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int arr2[]= new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=scan.nextInt();
        }
        int temp[]= new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr2[i]-arr[i];
        }
        HashMap<Integer,Integer> hmap= new HashMap<>();
        int res=0;
        int curr=0;
        for(int i=0;i<n;i++){
            curr+=temp[i];
            if(curr==0){
                res=i+1;
            }
            
            if(!hmap.containsKey(curr)){
                hmap.put(curr,i);
            }
            else{
                res=Math.max(res,i-hmap.get(curr));
            }
            
        }
        System.out.println(res);

    }
}