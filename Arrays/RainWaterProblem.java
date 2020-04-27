package Arrays;

import java.util.*;
class  RainWaterProblem{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
        int left[] =  new int[N];
        int right[] =  new int[N];
        left[0]=arr[0];
        for(int i=1;i<N;i++){
            left[i]= Math.max(left[i-1],arr[i]);
        }
        right[0]=arr[N-1];
       
        for(int i=N-2,j=1;i>=0;i--,j++){
         
            right[j]= Math.max(right[j-1],arr[i]);
           
         
        }
     
        int res =0;
        int dist =N-1;
        for(int i=0,j=0;i<N&&j<N;){
         if(left[i]<right[j]){
             res=Math.max(res,dist--*left[i++]);
         }
         else{
            res=Math.max(res,dist--*right[j++]);
         }
         
        }
        System.out.println(res);


          }
   }
}