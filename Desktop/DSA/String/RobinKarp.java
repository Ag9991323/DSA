package String;
import java.util.*;
class RobinKarp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- >0){
            String str=scan.next();
            String target= scan.next();
            int d=3;
            int q= 1000000007;
            int m =target.length();
            int h=1;
            for(int i=0;i<m-1;i++){
                h=(h*d)%q;
            }
            
            int p=0,s=0;
            for(int i=0;i<m;i++){
                p=(d*p+target.charAt(i))%q;
                s=(d*s+str.charAt(i))%q;
            }
           
            for(int i=0;i<=str.length()-m;i++){
                if(p==s){
                   boolean istrue=true;
                    for(int j=0;j<m;j++){
                        if(str.charAt(i+j)!=target.charAt(j)){
                            istrue=false;
                            return false;
                           
                        }
                    }
                    if(istrue){
                      return true;
                    }
                }
                if(i<str.length()-m){
                    s= (d*(s-str.charAt(i)*h)+str.charAt(i+m))%q;
                
                    if(s<0){
                        s=s+q;
                    }

                }
            }



        }
      
       
      
      



    }
}