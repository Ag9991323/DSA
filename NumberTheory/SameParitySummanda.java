import java.util.*;

public class Parity{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- >0){
            int N= scan.nextInt();
            int k = scan.nextInt();
            StringBuilder str = new StringBuilder();
            if(k>N) System.out.print("NO");
            else if(N%2==1&&k%2==0){
                System.out.print("NO");
            }
            
            else if(N%2==1&&k%2==1){
                str.append(N-(k-1)+" ");
                k--;
                while(k>0){
                    str.append(1+" ");
                    k--;
                }
                
                
            }
            else if(N%2==0&&k%2==1){
                if(N/k<2) System.out.print("NO");
                else{
                    while(N>2&&k>1){
                    str.append(2+" ");
                    N-=2;
                    k--;
                }
                str.append(N/k);
                }
                
            }
            else{
                while(k>1){
                    str.append(1+" ");
                    k--;
                    N--;
                }
               str.append(N+" ");
                
            }
            if(str.length()>0){
                System.out.println("YES");
            }
            System.out.println(str);
        }
    }
}