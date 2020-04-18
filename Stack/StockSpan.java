package Stack;
import java.util.*;
class  Stockspan{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
        Stack<Integer> st = new Stack<Integer>();
          st.push(0);
          System.out.println(1);
          for(int i=1;i<N;i++){
              
              while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){
                st.pop();
              }
              int span =st.isEmpty()? i+1:i-st.peek();
              System.out.print(span+" ");
              
            
              st.push(i);

          }
          System.out.println();
          }
          
   }
}