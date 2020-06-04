    import java.util.*;
     
    public class Main{
       
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            TreeSet<Long> set = new TreeSet<>();
            long Q=1000000000000000000L;
            long j=1;
               while(j<Q){
                   set.add(j);
                   j*=2;
                   
               }
              
            while(t-- >0){
               long count =0;
               long N= scan.nextLong();
               if(set.contains(N)){
                 count=set.higher(N);
               }
               else{
                  while(N>0){
                          count+=set.ceiling(N)-1;
                          long num=set.floor(N);
                          if(set.contains(N-num)){
                            count+=set.higher(N-num);
                            break;
                          }
                          N-=num;

                          
                      }
               }
               
           
               System.out.println(count-1);
     
            }
        }
    }