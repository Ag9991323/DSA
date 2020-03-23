package Matrix;
import java.util.*;
class Print{
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int m = scan.nextInt();
        int n =scan.nextInt();
        int arr[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
              int temp =arr[i][j];
              arr[i][j]=arr[j][i];
              arr[j][i]=temp;
            }
          
        }
        for(int i=0;i<m/2;i++){
            for(int j=0;j<n;j++){
              int temp =arr[i][j];
              arr[i][j]=arr[m-i-1][j];
              arr[m-i-1][j]=temp;
            }
          
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
          
        }
        
       

        }
    }
