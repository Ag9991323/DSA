package Stack;
import java.util.*;
class  EvaluatePostfix{
     static int fun(int num1,int num2,char c){
         if(c=='+') return num1+num2;
         else if(c=='-') return num1-num2;
         else if(c=='*') return num1*num2;
         else return num1/num2;
     }
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          String s = scan.next();
          Stack <Integer> st = new Stack<>();
          for(int i=0;i<s.length();i++){
              Character c = s.charAt(i);
              
             if(c>='0'&&c<='9') st.push(Integer.parseInt(c.toString(c)));
              else{
                  int num2=st.pop();
                  int num1= st.pop();
                  int res = fun(num1, num2, c);
                  st.push(res);

              }
          }
          System.out.println(st.pop());
          }
   }
}
 