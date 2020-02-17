import java.util.*;
class MaximumCircular{
     static int Kadane(int arr[],int n){
         int res=arr[0];
         int maxEnding=arr[0];
         for(int i=1;i<n;i++){
             maxEnding=Math.max(maxEnding+arr[i],arr[i]);
             res=Math.max(res,maxEnding);
         }
         return res;
     }

    static  int reverseKadane(int arr[],int n){
         int sum=0;
         int num1=Kadane(arr, n);
         if(num1<0){
             return num1;
         }
         for(int i=0;i<n;i++){
             sum+=arr[i];
             arr[i]=-arr[i];
         }
         int num=Kadane(arr, n);
         return sum+num;
     }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int n= scan.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }
            int num=Math.max(Kadane(arr, n),reverseKadane(arr, n));
        System.out.println(num);
        }
       


    }
}