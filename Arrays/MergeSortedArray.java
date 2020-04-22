package Arrays;

import java.util.*;
class  MergeSortedArray{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int M= scan.nextInt();
          int arr[] =  new int[N+M];
          int arr1[] =  new int[M];
          int arr2[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
          for(int i=0;i<M;i++)
               arr1[i]= scan.nextInt();
          for(int i=0;i<N;i++)
               arr2[i]= arr[i];    
          int i=0,j=0,k=0;
          for(;k<M+N&&i<M&&j<N;k++){
              if(arr2[i]>arr1[j])  arr[k]=arr1[j++];
              else  arr[k]=arr2[i++];
         }
         while(i!=M) arr[k++]=arr2[i++]; 
         while(j!=N) arr[k++]=arr1[j++]; 
          System.out.println(Arrays.toString(arr));       
          }
   }
}