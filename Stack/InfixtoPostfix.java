package Stack;
import java.util.*;
class  InfixtoPostfix{
    static int prec(char c){

      if(c=='^') return 3;
      else if(c=='*'||c=='/') return 2;
      else if(c=='+'||c=='-') return 1;
      else return 0;

    }
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
       
          String s = scan.next();
          StringBuilder str = new StringBuilder();
          Stack<Character> stack = new Stack<Character>();
          for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))
                 str.append(c);
            else{
              if(c=='(') stack.push('(');     
            
              else if(c==')'){
              while(!stack.isEmpty()&&stack.peek()!='('){
                char a =stack.pop();
                str.append(a);
               }
               stack.pop();
            }
            else { while(!stack.isEmpty()&&prec(c)<=prec(stack.peek()))
              str.append(stack.pop());
              stack.push(c);
            }
              

            }     
            

          } 
          while(!stack.isEmpty()){
            char a =stack.pop();
            str.append(a);
          }
            

          
          System.out.println(str);



          }
   }
}