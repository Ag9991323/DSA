package String;
import java.util.*;
class RobinKarp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        String target= scan.next();
        // int d =3;
        // int m =pat.length();
        // int n =txt.length();
        // int h=1;
        // int q =100000007;
        // for(int i=0;i<m-1;i++){
        //     h=(h*d)%q;
        // }
        
        // int p=0,t=0;
        // for(int i=0;i<m;i++){
        //     p=(p*d+pat.charAt(i))%q;
        //     t=(t*d+txt.charAt(i))%q;
        // }
        // for(int i=0;i<=n-m;i++){
        //    System.out.println(p+"   "+t);
        //     if(p==t){
               
        //         boolean ans=false;
        //         x:for(int j=0;j<m;j++){
        //             if(txt.charAt(i+j)!=pat.charAt(j)){
        //                 ans=true;
        //                 break x;
        //             }
        //         }
        //         if(ans==false){
        //             System.out.print(i+" ");
        //         }
        //     }
           
        //     if(i<(n-m)){
               
        //         t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+m))%q;
               
        //     }
        // }
       str=str+str;
       System.out.println(str);
        int d=3;
        int h=1;
        int q=100000007;
        int len_str=str.length();
        int len_t=target.length();
        for(int i=0;i<len_t-1;i++){
            h=(h*d)%q;
        }
        int p=0,t=0;
        for(int i=0;i<len_t;i++){
            p=(p*d+ target.charAt(i))%q;
            t=(t*d+str.charAt(i))%q;
      }
      for(int i=0;i<=len_str/2;i++){
         
          if(p==t){
              boolean ans=true;
             x: for(int j=0;j<len_t;j++){
                
                  if(str.charAt(j+i)!=target.charAt(j)){
                      if(i==2){
                        
                      }
                     ans=false; 
                     break x;
                  }
              }
              if(ans==true){
                  System.out.println(i);
                  break;
              }
          }
          if(i<(len_str-len_t)){
              System.out.println(p+"   "+t);
              t=(d*(t-str.charAt(i)*h)+str.charAt(i+len_t))%q;
              if(t<0){
                  t=t+q;
              }
          }
      }
      



    }
}