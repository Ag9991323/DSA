package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(s.isEmpty()) s.push(str.charAt(i));
            else  if(s.peek()==str.charAt(i)) s.pop();
            else s.push(str.charAt(i));
            
        }
        System.out.println(s.);
        
    }

}