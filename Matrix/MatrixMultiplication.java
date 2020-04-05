package Matrix;

import java.io.*;
import java.util.StringTokenizer;

class MAtrixMultiplication{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int t =Integer.parseInt(str);
        while(t-- >0){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int m1 =Integer.parseInt(token.nextToken());
            int n1 = Integer.parseInt(token.nextToken());
            int arr1 [][]= new int[m1][n1];
            token = new StringTokenizer(br.readLine());
            for(int i=0;i<m1;i++){
                for(int j=0;j<n1;j++){
                    arr1[i][j]=Integer.parseInt(token.nextToken());
                }
            }
             token = new StringTokenizer(br.readLine());
            int m2 =Integer.parseInt(token.nextToken());
            int n2 = Integer.parseInt(token.nextToken());
            int arr2 [][]= new int[m2][n2];
            token = new StringTokenizer(br.readLine());
            for(int i=0;i<m2;i++){
                for(int j=0;j<n2;j++){
                    arr2[i][j]=Integer.parseInt(token.nextToken());
                }
            }
          
            if(n1!=m2){
                System.out.println(-1);
            }
            else{
                int arr[][]= new int[m1][n2];
                for(int k=0;k<m1;k++){
                    for(int i=0;i<n1;i++){
                        int sum=0;
                        for(int j=0;j<m2;j++){
                            sum+=arr1[k][j]*arr2[j][i];
                          
                        }
                        arr[k][i]=sum;
                    }
                }

                StringBuilder string= new StringBuilder();
                for(int i=0;i<m1;i++){
                    for(int j=0;j<n2;j++){
                     string.append(arr[i][j]+" ");
                    }
                   
                }
                System.out.println(string);
                
            }
           
            


        }
    }
}