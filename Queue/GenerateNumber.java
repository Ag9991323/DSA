package Queue;

import java.util.*;
class  Main{

      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          Queue<String> q1 = new LinkedList<String>();
         q1.add("2");
         q1.add("3");
         q1.add("5");
         q1.add("7");
         

         int N=100;
         ArrayList<Integer> lst = new ArrayList<>();
         // lst.add(2);lst.add(3);lst.add(5);lst.add(7);
         for(int count=0;count<100;count++){
            String curr =q1.remove();
            lst.add(Integer.parseInt(curr));
            q1.add(curr+"2");
            q1.add(curr+"3");
            q1.add(curr+"5");
            q1.add(curr+"7");
         }
         System.out.println(lst);

   }
}