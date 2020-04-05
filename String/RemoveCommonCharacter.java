package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RemoveCommonCharacter{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- >0){
            String s1= scan.next();
            String s2 = scan.next().trim();
            HashMap<Character,Integer> map = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();
            for(int i=0;i<s1.length();i++){
                char x =s1.charAt(i);
                if(map.containsKey(x)){
                    map.put(x, map.get(x)+1);
                }
                else{
                    map.put(x, 1);
                }
            }

            for(int i=0;i<s2.length();i++){
                char x =s2.charAt(i);
                if(map2.containsKey(x)){
                    map2.put(x, map2.get(x)+1);
                }
                else{
                    map2.put(x, 1);
                }
            }
            
            StringBuilder str = new StringBuilder();
            for(int i=0;i<s1.length();i++){
                if(!map2.containsKey(s1.charAt(i))){

                
                    str.append(s1.charAt(i));
                }

            }
            for(int i=0;i<s2.length();i++){
                if(!map.containsKey(s2.charAt(i))){
                    str.append(s2.charAt(i));
                }

            }
            System.out.println(str);

        }
    }
}