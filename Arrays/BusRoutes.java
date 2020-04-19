package Arrays;

import java.util.*;
class  BusRoutes{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          for(int j=1;j<=t;j++){
          int N= scan.nextInt();
          long X= scan.nextInt();
          long Y=X;
       
          long max=0;
          Integer arr[] =  new Integer[N];
          for(int i=0;i<N;i++){
            arr[i]= scan.nextInt();
           }
           
        for(int i=N-1;i>=0;i--){
            X-=X%arr[i];
           }
        
          
          System.out.println("Case #"+j+": "+X);
             
          }
   }
}