    import java.util.*;
    public class C{
        public static void main(String arg[]){
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            while(t-- >0){
                
            long a = scan.nextLong();
            long b = scan.nextLong();
            long n = scan.nextLong();
            int count=0;
            while(a<=n&&b<=n){
                if(a<b){
                    a+=b;
                }
                else b+=a;
                count++;
            }
            System.out.println(count);
            }
           
        }
    }