package String;

import java.util.Scanner;

class MaximumOccuringCharacter{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- >0){
            String s = scan.next();
            int [] count = new int[256];
            int max=0;
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)]+=1;
                max= Math.max(max,count[s.charAt(i)]);
            }
           
            for(int i=0;i<256;i++){
                if(count[i]==max){
                    System.out.println((char)i);
                    break;
                }
            }
        }
    }
}