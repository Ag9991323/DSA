package NumberTheory;

import java.math.BigInteger;
import java.util.Scanner;

 class MatrixMultiplication {
    static int mod= 1000000007;
   

    static void mul(long I[][],long arr[][],int dim){
         long res[][]= new long[dim][dim];
         for(int i=0;i<dim;i++){
             for(int j=0;j<dim;j++){
                   
                    for(int k=0;k<dim;k++){
						
                     BigInteger x =BigInteger.valueOf(arr[i][k]*I[k][j]).mod(BigInteger.valueOf(mod));
                      
                      
                       x = x.add(BigInteger.valueOf(res[i][j])).mod(BigInteger.valueOf(mod));
                      
                       res[i][j]=x.intValue();
                     
                    }
                    
                    

             }
         }
         for(int i=0;i<dim;i++)
            for(int j=0;j<dim;j++)
                 I[i][j]= (res[i][j]%mod);


    }

    static void power(long arr[][],int dim,int n){
           long I[][]= new long[dim][dim];
           for(int i=0;i<dim;i++)
                for(int j=0;j<dim;j++)
                        I[i][j]= i==j?1:0;

                
           while(n>=1){
                if(n%2==1) {
                    mul(I,arr,dim);
                    n--;
                }
                else { mul(arr,arr,dim);
                    n/=2;
                }

           }
           for(int i=0;i<dim;i++)
                for(int j=0;j<dim;j++)
                     arr[i][j]=I[i][j];
          
                
                    
          
                
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while(t-- >0){
            int dim= scan.nextInt();
            int n = scan.nextInt();
            long arr[][]= new long[dim][dim];
            for(int i=0;i<dim;i++)
                for(int j=0;j<dim;j++)
                    arr[i][j]= scan.nextLong();
                          
          power(arr,dim,n);
           for(int i=0;i<dim;i++){
                for(int j=0;j<dim;j++)
                    System.out.print(arr[i][j]+" ");
                System.out.println();    
           }
           
                
            }
             
        }
        

                
    }
