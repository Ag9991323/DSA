package Tree;
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
     Scanner scan = new Scanner(System.in);
     int t = scan.nextInt();
     while(t-- >0){
         long N= scan.nextInt();
         double num = Math.sqrt(N);
       
         long num1 = (long)Math.pow(Math.floor(num),2);
         long num2 = (long)Math.pow(Math.ceil(num),2);
         if(num1==N){
             num1=(long)Math.pow(Math.floor(num-1),2);
         }
         if(num2==N){
            num2=(long)Math.pow(Math.ceil(num+1),2);
         }
         long min = Math.min(Math.abs(N-num1),Math.abs(N-num2));
         System.out.println(min);
     }
	 }
}