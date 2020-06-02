package NumberTheory;

import java.util.*;
class  Flip{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];      332 
          int sum=0;
          for(int i=0;i<N;i++){
            arr[i]= scan.nextInt();
            if(arr[i]==1) sum++;
          }
            
          int zerocount=0;
          int i=0;
          for(;i<N;i++){
                if(arr[i]!=1) {
                    
                    break;
                }
                
          }
          int localcount=0;
          
       
          for(;i<N;i++){
              if(arr[i]==0) {
                  localcount++;
                  
              }
              else if(arr[i]==1) localcount--;
              
              if(localcount<0) localcount=0;
             
             zerocount = Math.max(zerocount,localcount);
              

          } 
          
          if(sum!=N) sum+=zerocount;
          else sum=N-1;
          System.out.println(sum);

          

          }
   }
}