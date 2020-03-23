package Hashing;
import java.util.*;

import java.io.*;


class SubarraywithO{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine().trim());
        while(t-- >0){
            int N=Integer.parseInt(br.readLine().trim());
            int arr1[]= new int[N];
            
            StringTokenizer token = new StringTokenizer(br.readLine());
          
           int max= 0;
            for(int i=0;i<N;i++){
                arr1[i]=Integer.parseInt(token.nextToken());
            }
           
            HashSet<Integer> hashset= new  HashSet<>();
            boolean ans=false;
            for(int i=0;i<N;i++){
                max+=arr1[i];
                if(max==0){
                    ans=true;
                    break;
                }
                else if(hashset.contains(max)){
                    ans=true;
                    break;
                }
                hashset.add(max);
            }
            System.out.println(ans);
            
            
            
            
        }
    }
}