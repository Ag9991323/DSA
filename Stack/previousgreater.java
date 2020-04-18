package Stack;

import java.util.*;
class  previosgreater{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
          
          Stack<Integer> s = new Stack<Integer>();
          s.push(arr[0]);
          System.out.print(-1+" ");;
          for(int i=1;i<N;i++){
              while(!s.isEmpty()&&s.peek()<=arr[i]){
                  s.pop();
              }
              int val =s.isEmpty()?-1:s.peek();
              System.out.print(val+"  ");
              s.push(arr[i]);
             // System.out.println(s);
          }
        }
   }
}