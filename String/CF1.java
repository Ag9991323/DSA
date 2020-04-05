package String;
import java.util.*;
public class CF1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- >0){
            int n= scan.nextInt();
            int k= scan.nextInt();
        
            int count=1;
            int len=0;
            int len2=0;
            while(len<k){
                len2=len;
                len+=count;
                count++;
                
         }
        int loc=n-count;
        int num=k-=len2;
         
          StringBuilder str = new StringBuilder();
            for(int i=0;i<n;i++){
                if(i==loc||i==n-num){
                    str.append('b');
                }
                else{
                    str.append('a');
                }
            }
            System.out.println(str);

            

           
           
            

        }
    }
}