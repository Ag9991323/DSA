import java.util.*;
public class Polygon{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int N= scan.nextInt();
            int arr[][]= new int[N][N];
            for(int i=0;i<N;i++){
                String s = scan.next();
                for(int j=0;j<N;j++){
                    arr[i][j]=s.charAt(j)-48;
                    
                }
            }
            boolean matrix = true;
            x: for(int i=N-2;i>=0;i--){
                for(int j=N-2;j>=0;j--){
                    if(arr[i][j]==1){
                        if((arr[i][j+1]!=1)&&(arr[i+1][j]!=1))
                        {
                            matrix=false;
                            break  x;
                            
                        }
                    }
                }
            }
            if(matrix) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}