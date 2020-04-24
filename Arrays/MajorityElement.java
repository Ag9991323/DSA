package Arrays;
import java.util.*;
class  MajorityElement{
    static int majority(int arr[],int N){
        int count=1;
    
        int res =0;
        for(int i=1;i<N;i++){
            if(arr[i]==arr[res]) count++;
           else count--;
           if(count==0){
               count=1;
               res=i;
            }


        }
        return res;
    }
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
          int res = majority(arr, N);
          int count=0;
          for(int i=0;i<N;i++){
              if(arr[i]==arr[res]){
                  count++;
              }
          }
          if(count>Math.floor((double)N/2)) System.out.println(arr[res]);



          }
   }
}