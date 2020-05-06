package NumberTheory;

import java.math.BigInteger;
import java.util.*;

class Recurrence{
    static int mod=1000000007;
    static void mul(int[][] I,int t[][],int dim){
        int res[][]= new int[dim][dim];
        for(int i=0;i<dim;i++)
            for(int j=0;j<dim;j++)
                for(int k=0;k<dim;k++){
                    BigInteger x =BigInteger.valueOf(t[i][k]*I[k][j]).mod(BigInteger.valueOf(mod));
                      
                      
                    x = x.add(BigInteger.valueOf(res[i][j])).mod(BigInteger.valueOf(mod));
                    res[i][j]=x.intValue();
                }
                  
       
       
                    for(int i=0;i<dim;i++)
            for(int j=0;j<dim;j++)
                    I[i][j]=res[i][j];

    }

   static int exponent(int []arr,int dim,int pow){

       if(pow<=2) return arr[pow-1];
        int I[][] = new int[2][2];
        for(int i=0;i<dim;i++)
            for(int j=0;j<dim;j++)
                I[i][j]= i==j?1:0;
        int t[][] = new int[dim][dim];
        t[0][0]=0;
        t[0][1]=1;
        t[1][0]=1;
        t[1][1]=1;        
     
       while(pow>=1){
           if(pow%2==1) {
            mul( I, t,dim);
            pow--;
           }
           else{
               mul(t,t,dim);
               pow/=2;
           }

       }
       
       for(int i=0;i<dim;i++)
            for(int j=0;j<dim;j++)
        t[i][j]= (I[i][j]%mod);    
        
      int x= (arr[0]*t[0][0]+arr[1]*t[1][0])%mod; 
      return x;     
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dim = scan.nextInt();
       
        int  n = scan.nextInt();
        
        int arr[] = new int[dim];
        for(int i=0;i<2;i++)
                arr[i] = scan.nextInt();
        for(int i=1;i<=n;i++){
            int num= exponent(arr,dim,i);
            System.out.println(num);
        }
                
       
        

    }
}