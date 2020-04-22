package Arrays;

import java.util.*;
class  RemoveDuplicateFromSortedArray{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
          int count=1;     
          for(int i=1;i<N;i++)
              if(arr[i]!=arr[i-1]){
                arr[count]=arr[i];
                count++;
              }
                  
        
          System.out.println(count);  
          System.out.println(Arrays.toString(arr));        
             

          }
   }
}