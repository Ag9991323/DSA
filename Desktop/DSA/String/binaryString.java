package String;
import java.util.*;
class BinaryString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- >0){
            int N= scan.nextInt();
            String s = scan.next();
            int len =0;
            for(int i=0;i<N;i++){
                if(s.charAt(i)=='1'){
                    len++;
                }
            }
            System.out.println(len*(len-1)/2);

        }
    }
}