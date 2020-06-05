package NumberTheory;
import java.util.*;

public class NumberDigit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = {9,99,999,9999,99999,999999,9999999};
        int count=0;
        while(N>0){
            if(N<10)
            { count+=N;
            break;
            }
            
            int num = (int)Math.log10(N);
           count = count+ (N-arr[num-1])*(num+1);
            N=arr[num-1];
            
        }
        System.out.println(count);
    }
    
}