package Stack;

import java.util.*;
class  Main{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
            Stack<Integer> st = new Stack<Integer>();
           // st.push(arr[N-1]);
            for(int i=N-1;i>=0;i--){
                while(!st.isEmpty()&&st.peek()<=arr[i]){
                    st.pop();
                }
                int val =st.isEmpty()?-1:st.peek();
                System.out.println(val);
                st.push(arr[i]);



            }

          }
   }
}