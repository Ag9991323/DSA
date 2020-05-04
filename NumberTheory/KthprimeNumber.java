package NumberTheory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class  Main{
      public static void main(String[] args) throws Exception{
          Scanner scan = new Scanner(System.in);
          int max=87000008;
          ArrayList<Integer> lst = new ArrayList<>(50000000);
          BitSet prime= new BitSet(max+1);
           prime.set(2,max+1);
       
          for(int i=2;i*i<=max;i++){
              if(prime.get(i)){
                  for(int j=i*i;j<max;j+=i) prime.flip(j);
              }
          }
          int j=0;
          for(int i=0;i<=max;i++){
                if(prime.get(i)) lst.add(i);
          }
          int t = scan.nextInt();
         
          //for(int i=0;i<10;i++) System.out.println(prime[i]);
          StringBuilder str = new StringBuilder();
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          while(t-- >0){
          int N= Integer.parseInt(br.readLine());
           str.append(lst.get(N-1)+"\n");
          }
          System.out.print(str);

   }
}