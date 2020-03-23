package Hashing;
import java.util.*;
class UnionOfArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m =scan.nextInt();
        int number =scan.nextInt();
       
        int arr[] = new int[m];
      
        for(int i=0;i<m;i++){
            arr[i]=scan.nextInt();
         
        }
        int prefixsum=0;
        int res=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<m;i++){
            prefixsum+=arr[i];
            if(h.containsKey(prefixsum-number)){
                res=Math.max(res,i-(h.get(prefixsum-number)));
                System.out.println(i+"   "+h.get(prefixsum-number)+"  ");
               
            }
            if(prefixsum==number){
                res=Math.max(res,i+1);
              
            }
            if(!h.containsKey(prefixsum)){
                h.put(prefixsum,i);
            }
           
        }
        System.out.println(res);
        System.out.println(h);
        
       
        
    }

}