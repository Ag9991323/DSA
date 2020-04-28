package Infosys;

import java.util.*;
 class  something{
    static  int majority(int arr[],int N){
        int count=1;
        int res=arr[0];
        for(int i=1;i<N;i++){
            if(arr[i]==res)count++;
            else count--;
            if(count==0){
                res=arr[i];
                count=1;
            }

            
        }
        return res;
    }
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int N= scan.nextInt();
          int arr []= new int[N];
          for(int i=0;i<N;i++){
            arr[i]= scan.nextInt();
          }
          int num=majority(arr,N);
          int count=0;
          for(int i=0;i<N;i++){
              if(arr[i]==num)count++;
             }
             if(count<=Math.ceil((double)N/2))System.out.println("YES"); 
             else System.out.println("NO");
        
         
         

          }
   }
