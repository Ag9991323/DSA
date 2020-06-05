    import java.util.*;
     
    public class Exchange{
      
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int N= scan.nextInt();
            int d = scan.nextInt();
            int arr[] = new int[N+1];
            arr[0]=0;
            int E= scan.nextInt();
            E*=5;
            for(int i=1;i<=N;i++){
                if(d<=i&&E<=i) arr[i]= Math.min(arr[i-d],arr[i-E]);
                else if(d<=i) arr[i]= arr[i-d];
                else if(E<=i) arr[i]= arr[i-E];
                else arr[i]=i;
            }
           
             System.out.println(arr[N]);
         
            
        }
    }