package Hashing;
import java.util.*;

import java.io.*;


class ArraysareEqual{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine().trim());
        while(t-- >0){
            int N=Integer.parseInt(br.readLine().trim());
            int arr1[]= new int[N];
            int arr2[]=new int[N];
            StringTokenizer token = new StringTokenizer(br.readLine());
            HashMap<Integer,Integer> hset = new HashMap<>();
          
            for(int i=0;i<N;i++){
                arr1[i]=Integer.parseInt(token.nextToken());
                if(hset.containsKey(arr1[i])){
                    hset.put(arr1[i],hset.get(arr1[i])+1);
                }
                else{
                    hset.put(arr1[i],1);
                }
            }
            token = new StringTokenizer(br.readLine());
            int ans =1;
            for(int i=0;i<N;i++){
                arr2[i]=Integer.parseInt(token.nextToken());
                
                if(hset.containsKey(arr2[i])){
                    hset.put(arr2[i],hset.get(arr2[i])-1);
                    if(hset.get(arr2[i])==0){
                        hset.remove(arr2[i]);
                    }
                }
                else{
                    ans=0;
                    
                }
                
            }
            
           
            
            
            System.out.println(ans);
            
        }
    }
}