package NumberTheory;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;



class PrimePrime {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
*/
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int max=1000000;
        int arr[][] = new int[max+1][2];
        for(int i=0;i<=max;i++) arr[i][0]=1;
        arr[0][0]=0;
        arr[1][0]=0;
        
      
  
        for(int i=2;i*i<=max;i++){
            if(arr[i][0]==1){
                
               for(int j=i*i;j<=max;j+=i) arr[j][0]=0;
            }
           
              
        }
        int val=0;

        for(int i=1;i<=max;i++){
            if(arr[i][0]==1) val++;
            arr[i][1]=val;
        }
            int arr2[]= new int[max+1];
          int score=0;
            for(int i=1;i<=max;i++){
                int num=arr[i][1];
                if(arr[num][0]==1) score++;
                arr2[i]=score;
            }
          
         
        
        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l =Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            int lower=arr2[l-1];
            int higher= arr2[r];

          System.out.println(higher-lower);
        }



       

    }
}