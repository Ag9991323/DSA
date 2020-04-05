package String;

import java.util.Arrays;
import java.util.Scanner;

class LeftmostCharacterRepeats{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while(t-- >0){
            String s = scan.next();
            int count[]= new int[256];
            for(int i=0;i<256;i++){
                count[i]=-1;
            }
            int res=Integer.MAX_VALUE;
            for(int i=s.length()-1;i>=0;i--){
                int num=s.charAt(i);
               // System.out.println(count[num]);
                if(count[(int)s.charAt(i)]==-1){
                   
                    count[s.charAt(i)]=i;
                }
                else{
                    count[s.charAt(i)]=-3;
                }
            }
          
            for(int i=0;i<256;i++){
                if(count[i]>0){
                    res=Math.min(res,count[i]);
                }
            }
            
         
        }
    }
}