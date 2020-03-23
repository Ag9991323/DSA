package Matrix;

import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.*;

class SortedMatrix{
    public static String  searchfun(int arr[][],int x,int i,int j,int m,int n){

       
        int val =arr[i][j];
        if(val ==x){
            return i+" "+j;
        }
        else if(i<m&&j>0){
            if(val>x){
                return searchfun(arr,x,i,j-1,m,n);
            }
                else{
                    return searchfun(arr,x,i+1,j,m,n);
                }
        }
          
        
        return "false";
        
       
        

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer token = new StringTokenizer(str);
        int m =Integer.parseInt(token.nextToken());
        int n = Integer.parseInt(token.nextToken());
        int arr[][]= new int[m][n];
        str = br.readLine();
        
        token = new StringTokenizer(str);
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(token.nextToken());

            }
        }
        String ans =searchfun(arr,32,0,n-1,m,n);
        System.out.println(ans);



    }
}