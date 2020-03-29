package String;
import java.util.*;
class SmallestWordString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            String s = scan.next();
            String p = scan.next();
           HashMap<Character,Integer> map=new HashMap<>();
           for(int i=0;i<p.length();i++){
               char a =p.charAt(i);
               if(map.containsKey(a)){
                   map.put(a,map.get(a)+1);
               }
               else{
                   map.put(a,1);
               }
           }
           HashMap<Character,Integer> map2=map;
           int count=0;
           int num=0;
           for(int i=0;i<s.length();i++){
                if(map2.containsKey(s.charAt(i))){
                    int temp=map2.get(s.charAt(i));
                    map2.put(s.charAt(i), map.get(s.charAt(i))-1);
                    count++;
                    if(temp==1){
                        map2.remove(s.charAt(i));
                    }
                }
                if(count==p.length()){
                    num=i;
                    break;
                }


           }
           System.out.println(num);

        }
    }
}