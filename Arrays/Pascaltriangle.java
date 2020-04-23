package Arrays;
import java.util.*;
class  BuyStock{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] = new int[N];
          for (int i=0;i<N;i++)
            arr[i]=scan.nextInt();
          int min = arr[0];
          int res=0;
          for(int i=1;i<N;i++){
              int diff = arr[i]-min;
              min= Math.min(min,arr[i]);
              res = Math.max(res,diff);

          }
          System.out.println(res);
         

              }
          }
          
   }
