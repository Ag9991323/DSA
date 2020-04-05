package String;
import java.util.*;
class ReverseWordsInAString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            String s = scan.next();
            ArrayList<String> lst = new ArrayList<>();
            String st="";
            for(int i=0;i<s.length();i++){
              
                if(s.charAt(i)!='.'){
                    st+=s.charAt(i);
                }
                else{
                    lst.add(st);
                    st="";
                }
               
            }
            lst.add(st);
            StringBuilder str = new StringBuilder();
            for(int i=lst.size()-1;i>0;i--){
                str.append(lst.get(i)+".");
            }
            str.append(lst.get(0));
            System.out.println(str);
        }
    }
}