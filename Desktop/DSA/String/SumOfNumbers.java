package String;
import java.util.*;
class SumOfNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- >0){
            String s= scan.next();
            long sum=0;
           
            for(int i=0;i<s.length();i++){
                String count="";
                int x =s.charAt(i);
                int j=i;
                
                while(x>47&&x<58&&j<s.length()-1){
                    
                    count+=(char)x;
                    x=s.charAt(++j); 
                   
                }
                if(!count.isEmpty()||j==s.length()-1){
                    if(j==s.length()-1&&(x>47&&x<58)){
                        count+=(char)x;

                    }
                    sum+=Integer.parseInt(count);
                    count="";
                    i=j;
                   
                }
            


            }
            System.out.println(sum);

        }
    }
}