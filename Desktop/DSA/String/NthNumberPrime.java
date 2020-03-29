package String;
import java.util.*;
class NthNumberPrime{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
          int N= scan.nextInt();
           ArrayList<Integer> lst = new ArrayList<>();
            int num=1;
            while(lst.size()!=100){
                num++;
             
                int number = num;
                boolean primenum=true;
                while(number>0){
                    int temp=number%10;
                    if(temp!=2&&temp!=3&&temp!=5&&temp!=7){
                        primenum=false;
                        break;
                    }
                    number/=10;
                   
                }
                if(primenum){
                  
                    lst.add(num);
                }
            }
            System.out.println(lst.get(N-1));
         

        }
    }
}