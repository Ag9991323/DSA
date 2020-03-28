package String;
import java.util.*;
class isomorphic{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- >0){
            String s1 = scan.next();
            String s2 = scan.next();
            HashMap<Character,Integer> map= new HashMap<>();
            HashMap<Character,Integer> map2= new HashMap<>();
            if(s1.length()!=s2.length()){
                System.out.println("false");
            }
            for(int i=0;i<s1.length();i++){
                char a=s1.charAt(i);
                char b =s2.charAt(i);
                int num=0;
                
                if(map.containsKey(a)){
                     num=map.get(a);
                    map.put(a, ++num);
                }
                else{
                    map.put(a, ++num);
                }
                int num2=0;
                if(map2.containsKey(b)){
                    num2= map2.get(b);
                    map2.put(b,++num2);
                }
                else{
                    map.put(b,++num2);
                }
                if(num!=num2){
                   System.out.println("false");
                }
            }
            // return true;
        }
    }
}