package Stack;

import java.util.*;
class  getMin{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
          Stack<Integer> stack = new Stack<Integer>();
          stack.push(arr[0]);
          for(int i=1;i<N;i++){
            int val=  stack.peek()<=arr[i]?stack.peek():arr[i];
            stack.push(val);

          }
          for(int i=N-1;i>=0;i--) 
             System.out.print(stack.pop()+" ");
          System.out.println();   
          }

   }
}