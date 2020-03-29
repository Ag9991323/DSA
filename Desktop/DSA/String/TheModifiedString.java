package String;
import java.util.*;
class TheModifiedString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int count=0;
            String s = scan.next();
            if(s.length()<3){
               
            }else{
              
                for(int i=2;i<s.length();i++){
                    if(s.charAt(i)==s.charAt(i-1)&&s.charAt(i-1)==s.charAt(i-2)){
                        count++;
                        i+=1;
                    }

                }
            }
      
            System.out.println(count);
            
           
        }
    }
}