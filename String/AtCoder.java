package String;
import java.math.BigInteger;
import java.util.*;
import java.util.Arrays;
public class AtCoder{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y= scan.nextInt();
        int A= scan.nextInt();
        int B= scan.nextInt();
        int c= scan.nextInt();
        Integer red[]= new Integer[A];
        Integer green[]= new  Integer[B];
        Integer colorless[]= new  Integer[c];
        for(int i=0;i<A;i++){
            red[i]= scan.nextInt();
        }
        for(int i=0;i<B;i++){
            green[i]= scan.nextInt();
        }
        for(int i=0;i<c;i++){
            colorless[i]= scan.nextInt();
        }
        Arrays.sort(red,Collections.reverseOrder());
        Arrays.sort(green,Collections.reverseOrder());
        Arrays.sort(colorless,Collections.reverseOrder());
        int i=x-1;
        int j=y-1;
        int k=0;
         BigInteger sum=BigInteger.valueOf(0);
      
       
        while(i>-1&&j>-1){
            
            int temp1=red[i];
            int temp2=green[j];
            
            if(k<colorless.length){
                int temp3=colorless[k];
                if(temp1>temp2&&temp3>temp2){
                    sum=sum.add(BigInteger.valueOf(temp3));
                    k++;
                    j--;
                   
                }
               
             else if(temp2>temp1&& temp3>temp1){
                sum=sum.add(BigInteger.valueOf(temp3));
                k++;
                i--;
             }
             else{
                sum=sum.add(BigInteger.valueOf(temp1));
                sum=sum.add(BigInteger.valueOf(temp2));
                 i--;
                 j--;
             }

             }
             else{
                 break;
             }
               
           }
           while(i>-1){
               int temp=red[i];
               if(k<colorless.length){
                int temp2=colorless[k];
                if(temp2>temp){
                    sum=sum.add(BigInteger.valueOf(temp2));
                    i--;
                    k++;
                }
                else{
                    sum=sum.add(BigInteger.valueOf(temp));
                    i--;
                }
               }
               else{
                   
                sum=sum.add(BigInteger.valueOf(temp));
                   i--;
                 
               }
               
           }
           while(j>-1){
              
            int temp=green[j];
            if(k<colorless.length){
             int temp2=colorless[k];
             if(temp2>temp){
                sum=sum.add(BigInteger.valueOf(temp2));
                 j--;
                 k++;
             }
             else{
                sum=sum.add(BigInteger.valueOf(temp));
                 j--;
             }
            }
            else{
                sum=sum.add(BigInteger.valueOf(temp));
                j--;
            }
            
        }
          System.out.println(sum);
            
        }

        
    }
    
