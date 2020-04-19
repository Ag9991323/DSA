package Arrays;

import java.util.*;
class  Main{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          for(int j=1;j<=t;j++){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
          
          int num=arr[0];
          int count=0;
          for(int i=1;i<N-1;i++){
            if(arr[i]>num&&arr[i]>arr[i+1]){
                count++;
                i++;
            }
          }
          System.out.println("Case #"+j+": "+count);
        }
   }
}