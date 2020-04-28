package Queue;

import java.util.*;
class  ReverseK{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int k = scan.nextInt();
         Queue<Integer> q = new LinkedList<Integer>();
         Queue<Integer> q2 = new LinkedList<Integer>();
         for(int i=0;i<N;i++)
            q.add(scan.nextInt());
         Stack<Integer> st = new Stack<Integer>();   
         for(int i=0;i<k&&i<N;i++)
            st.push(q.poll());
         for(int i=k;i<N;i++)
            q2.add(q.poll());
         for(int i=0;i<k&&i<N;i++)
            q.add(st.pop());
         for(int i=k;i<N;i++)
            q2.add(q2.poll());  
         System.out.println(q);    

  
  
        }
}
}