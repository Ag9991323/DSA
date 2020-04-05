package Sorting;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



class Subset{
    static int count=0;
    public static void subset(int arr[],int sum,int curr,int index,int n,int start){
        if(index == n){
           return ;
        }
        else if(curr==sum)
            count++;
        else if (curr>sum){
            curr-=arr[start++];
        }    
        else{
            subset(arr, sum, curr, index+1, n,start);
            subset(arr, sum, curr+arr[index], index+1, n,start);
        }
        
    }
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int n = Integer.parseInt(str);
        str = bf.readLine();
        StringTokenizer token = new StringTokenizer(str);
        int arr []=new int[n];
        int i=0;
        while(token.hasMoreTokens()){
            arr[i++]=Integer.parseInt(token.nextToken());
        }
        str = bf.readLine();
        int sum =Integer.parseInt(str);
        subset(arr, sum, arr[0], 0, n,0);
        System.out.println(count);    }
}