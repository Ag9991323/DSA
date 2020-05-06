package NumberTheory;

import java.util.*;
class  ArpaLand{

    static  int lastdigit(int number,int n){
          int res=1;
          while(n>0){
              if(n%2==1){
                  res=(res*(number%10))%10;
                  n--;
              }
              else{
                  n/=2;
                  number = ((number%10)*(number%10))%10;
              }
          }
          return res;
    }
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int n= scan.nextInt();
          int ans= lastdigit(1378, n);
          System.out.println(ans);
   }
}