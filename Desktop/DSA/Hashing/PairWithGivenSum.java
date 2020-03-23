package Hashing;
import java.util.*;

import java.io.*;

import java.io.*;
class PairWithGivenSum{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine().trim());
        while(t-- >0){
            int N=Integer.parseInt(br.readLine().trim());
            int arr[]= new int[N];
            StringTokenizer token = new StringTokenizer(br.readLine());
            HashMap<Integer,Integer> hset = new HashMap<>();
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(token.nextToken());
                if(hset.containsKey(arr[i])){
                    hset.put(arr[i],hset.get(arr[i])+1);
                }
                else{
                    hset.put(arr[i],1);
                }
            }
            int sum=Integer.parseInt(br.readLine());
           
            
           int ans=0;
            for(int i=0;i<N;i++){
                if(hset.get(arr[i])==1){
                    if(sum-arr[i]==arr[i]){
                        continue;
                    }
                    else if(hset.containsKey(sum-arr[i])){
                        ans=1;
                        break;
                    }
                  
                }
                else{
                    if(hset.containsKey(sum-arr[i])){
                        ans=1;
                        break;
                    }
                }
               

            }
            System.out.println(ans);
        }
    }
}