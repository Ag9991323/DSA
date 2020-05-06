
package NumberTheory;

import java.util.*;
class  GCD{

    static void left(int left[]){
        int gcd=0;
        for(int i=0;i<left.length;i++){

            int b=left[i];
            while(b!=0){
                //System.out.print("gcd  first"+ gcd);
                int temp=gcd;
                 gcd=b;
                 b=temp%b;
            }
            left[i]=gcd;
        //System.out.println("second :  "+ gcd);
        }
      
        

    }

    static void right(int right[]){
        int gcd=0;
        for(int i=right.length-1;i>=0;i--){

            int b=right[i];
            while(b!=0){
                int temp=gcd;
                 gcd=b;
                 b=temp%b;
            }
            right[i]=gcd;
         
        }

    }
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int q= scan.nextInt();
          int arr[] =  new int[N];
          int left[] =  new int[N];
          int right[] =  new int[N];
          
          for(int i=0;i<N;i++){
            arr[i]= scan.nextInt();
            left[i]=arr[i];
            right[i]=arr[i];
          }
          left(left);
          right(right);
              
               
        StringBuilder str = new StringBuilder();
          for(int i=0;i<q;i++){
              int l = scan.nextInt();
              int r = scan.nextInt();
              int num1=0;
              int num2=0;
              if(l>1) num1=left[l-2];
              if(r<N) num2=right[r];
              while(num2!=0){
                  int temp =num1;
                  num1=num2;
                  num2=temp%num2;
              }
              
              str.append(num1+"\n");
          }
          System.out.print(str);
        }
   }
}