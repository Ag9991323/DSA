package NumberTheory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



class modularGCD {
    static int mod =1000000007;

    static long power(long A,long N,long d){
        long res=1;
        while(N>0){
            if(N%2==1){
                res=((res%d)*(A%d))%d;
                N--;

            }
            else{
                A=((A%d)*(A%d))%d;
                N/=2;
            }
            
        }
        return res;
    }
     
    static long GCD(long A,long B,long N){
        if(A==B){
            return ((power(A,N,mod)+power(B,N,mod))%mod);
        }
        long candidate=1;
        long number =A-B;
        for(long i=1;i*i<=number;i++){
            if(number%i==0){
               long temp= (power(A,N,i)+power(B,N,i))%i;
                if(temp==0) candidate =Math.max(candidate,i);

                temp= ((power(A,N,(number/i))+power(B,N,(number/i)))%(number/i));
                if(temp==0) candidate =Math.max(candidate,number/i);
                
            }
        }
        return candidate%mod;
    }
     public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-- >0){
            StringTokenizer str = new StringTokenizer(br.readLine());
            long A= Long.parseLong(str.nextToken());
            long B= Long.parseLong(str.nextToken());
            long N= Long.parseLong(str.nextToken());
            long num= GCD(A,B,N);
            System.out.println(num);
        }

     }
    
}