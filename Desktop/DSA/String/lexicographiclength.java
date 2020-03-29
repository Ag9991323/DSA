package String;
import java.util.*;
 class Lexicographic{
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         int t = scan.nextInt();
         while(t-- >0){
             String s = scan.next();
         
         char[] arr= new char[s.length()];
         for(int i=0;i<s.length();i++){
                arr[i]=s.charAt(i);
         }
         Arrays.sort(arr);
         for(int i=0;i<s.length()-1;i++){
           
             if(arr[i]==arr[i+1]){
                 //return 0;
             }
         }
       
         int fact =1;
         int q =1000000007;
         for(int i=1;i<s.length()+1;i++){
           fact =(fact*i)%q;

         }
        
         long count=1;
         int num=s.length();
         for(int i=0;i<s.length();i++){
             char x = s.charAt(i);
             int tempcount=0;
             for(int j=0;j<s.length();j++){
                 if(arr[j]==x){
                     tempcount=j;
                      break;
                 }
             }
             fact= fact/num--;
            
             count+= (fact)*tempcount;
         
             
      

             for(int j=tempcount;j<s.length()-1;j++){
                 arr[j]=arr[j+1];
             }
            


         }
         System.out.println(count);

        }
     }
 }