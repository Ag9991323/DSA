package String;
import java.util.*;
class pangram{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            String s = scan.next();
            int []  arr= new int[26];
            for(int i=0;i<26;i++){
                arr[i]=1;
            }
            s=s.toLowerCase().trim();
            for(int i=0;i<s.length();i++){
                int temp=s.charAt(i);
                if(temp>96&&temp<123){
                
                    arr[temp-97]-=1;
                }
                
            }
            System.out.println(Arrays.toString(arr));
            for(int i=0;i<26;i++){
                if(arr[i]>0){
                    System.out.println("false"+ i);
                
                    break;
                }
            }
            System.out.println("true");
            
        }
    }
}