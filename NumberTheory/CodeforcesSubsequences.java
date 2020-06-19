        import java.util.*;
        public class Main{
            public static void main(String arg[]){
                Scanner scan = new Scanner(System.in);
               
                long k = scan.nextLong();
                long count=1;
                String arr[]= new String[]{"c","o","d","e","f","o","r","c","e","s"};
                int num[]= new int[10];
                for(int i=0;i<10;i++) num[i]=1;
                
               x: while(k>count){
                    
                    for(int i=0;i<10;i++){
                       if(count>=k) break ;
                        char c = arr[i].charAt(0);
                        arr[i]+=c;
                        int temp= num[i];
                        num[i]++;
                        count= (count/temp)*(temp+1);
                        if(count>=k) break ;
                    }
                    
                }
                StringBuilder str = new StringBuilder();
                for(int i=0;i<10;i++){
                    str.append(arr[i]);
                }
                System.out.println(str);
               
            }
        }