package Queue;

import java.util.*;
class  Maximum{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          int k = scan.nextInt();  
         Deque<Integer> d = new LinkedList<>();
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
           
          for(int i=0;i<k;i++){
            
             while(!d.isEmpty()&&arr[d.peekLast()]<=arr[i]){
                      d.pollLast();
                  }
                  d.offerLast(i);
            }
         System.out.println();
          for(int i=k;i<N;i++){
              System.out.print(arr[d.peekFirst()]+" "); 
           
              while(!d.isEmpty()&&d.peek()<=i-k){
                  d.pollFirst();
            }
                while(!d.isEmpty()&&arr[d.peekLast()]<=arr[i]){
                    d.pollLast();
                }
                d.offerLast(i);
            }
            System.out.println(arr[d.pollFirst()]);
        }

          
             
          

          }
   }
