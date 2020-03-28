package String;
import java.util.*;
class ReverseWordsInAString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            String str = scan.next();
            String pat = scan.next();
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i=0;i<str.length();i++){
                if(!map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i), i);
                }
            }
            for(int i=0;i<pat.length();i++){
                if(map.containsKey(pat.charAt(i))){
                    return pat.charAt(i);
                }
            }
           
        }
    }
}