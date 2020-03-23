package Matrix;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Adding{
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int t = Integer.parseInt(str);
        while(t-- >0){
            str = bf.readLine();
            StringTokenizer token = new StringTokenizer(str);
            int n1= Integer.parseInt(token.nextToken());
            int m1 =Integer.parseInt(token.nextToken());
            int arr[][]= new int[n1][m1];
            str = bf.readLine();
            token = new StringTokenizer(str);
            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    arr[i][j]=Integer.parseInt(token.nextToken());

                }
            }

            str = bf.readLine();
            token = new StringTokenizer(str);
            int n2= Integer.parseInt(token.nextToken());
            int m2 =Integer.parseInt(token.nextToken());
            if(n1==n2&&m1==m2){
                str = bf.readLine();
                token = new StringTokenizer(str);
                for(int i=0;i<n1;i++){
                    for(int j=0;j<m1;j++){
                        arr[i][j]+=Integer.parseInt(token.nextToken());
                    }
                }
                StringBuilder stringbuider = new StringBuilder();
                for(int i=0;i<n1;i++){
                    for(int j=0;j<m1;j++){
                       stringbuider.append(arr[i][j]+" ");
                    }
                }
                System.out.println(stringbuider);
            }
            else{
                System.out.println(-1);
            }
            
            

        }
    }
}