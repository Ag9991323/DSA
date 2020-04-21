package Stack;
import java.util.*;
class  RectangularHologram{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();
          Stack<Integer> st = new Stack<>();
          int i=1;
          st.push(0);
          int maxArea=0;
          for(;i<N;i++){
              while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
                  int top = st.pop();
                  int Area=0;
                  if(st.isEmpty())
                       Area =arr[top]*i;
                  else Area =arr[top]*(i-st.peek()-1);
                  maxArea = Math.max(Area,maxArea);    
                  
               
              }
              st.push(i);
            } 
            while(!st.isEmpty()){
                int top = st.pop();
                  int Area=0;
                  if(st.isEmpty())
                       Area =arr[top]*i;
                  else Area =arr[top]*(i-st.peek()-1);
                  maxArea = Math.max(Area,maxArea); 
            }
            System.out.println(maxArea);    
          }
   }
}