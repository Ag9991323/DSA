package Stack;
import java.util.*;
class Perfect{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int t= scan.nextInt();
        // boolean arr[] = new boolean[1000000000+1];
        // for(int i=1;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=1;j<i/2;j++){
        //         if(i%j==0){
        //             sum+=j;
        //         }
        //     }
        //     if(sum==i){
        //         arr[i]=true;
        //     }
        //    else{
        //     arr[i]=false;
        //    }
        // }
        while(t-->0){
            int n = scan.nextInt();
            
            
                int sum=0;
                for(int j=1;j<=Math.sqrt(n);j++){
                    if(n%j==0){
                        sum+=j;
                    }
                }
                if(sum==n){
                   System.out.println("YES");
                }
               else{
                System.out.println("NO");
               }
            }
           
        }
        
    }
