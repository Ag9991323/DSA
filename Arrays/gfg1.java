package Arrays;
import java.util.*;
class gfg1{
    static int kadane(int[] arr,int N){
        int res=arr[0];
        int curr=arr[0];
       
      
        for(int i=1;i<N;i++){
               
         
           curr=Math.max(curr+arr[i],arr[i]);
           res=Math.max(res,curr);
           
         
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while(t-- >0){
            int N= scan.nextInt();
            int [] arr = new int[N];
            int sum=0;
            for(int i=0;i<N;i++){
                arr[i]= scan.nextInt();
                sum+=arr[i];
            }
            int normalkaden= kadane(arr, N);
            for(int i=0;i<N;i++){
                arr[i]=-arr[i];
            }

           int Num=   kadane(arr, N);
           System.out.println(Num);
         
           if(Num<=0){
               System.out.println(sum);
           }
          System.out.println(Math.max(sum+Num,normalkaden));
        }
    }
}