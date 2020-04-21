package Stack;

import java.util.*;
class  Probem{
     static int knows(int[][]arr,int A,int B){
         if(arr[A][B]==1&&arr[B][A]==0)return B;
         else return A;
     }
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[][] =  new int[N][N];
          for(int i=0;i<N;i++)
             for(int j=0;j<N;j++)
               arr[i][j]= scan.nextInt();
               Stack<Integer> st = new Stack<>();
          for(int i=N-1;i>=0;i--)
             st.push(i);
          while(st.size()==1){
            int A= st.pop();
            int B= st.pop();
            int num =knows(arr,A,B);
            st.push(num);

          } 
          int num= st.peek();
          for(int i=0;i<N;i++){
              if(arr[num][i]!=0&&arr[i][num]!=1){
                  return -1;
              }
          }  
          return num;



         }
        // return res;
       
               


          }
   }
