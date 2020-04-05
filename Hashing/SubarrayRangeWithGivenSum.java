package Hashing;
import java.util.*;

import java.io.*;


class Subarraywithgivensum{
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
            int sum=Integer.parseInt(br.readLine());
           
            HashMap<Integer,Integer> hashset= new  HashMap<>();
            int count=0;
            for(int i=0;i<N;i++){
                max+=arr1[i];
                if(max==sum){
                    System.out.println(i+" hello");
                    count++;
                   
                  
                }
                
                if(hashset.containsKey(max-sum)){
                   
                   count+=hashset.get(max-sum);
                   
                  
                }
                if(hashset.containsKey(max)){
                    hashset.put(max,hashset.get(max)+1);
                }
                else{
                    hashset.put(max,1);
                }
               
                
            }
            System.out.println(hashset);
          
            System.out.println(count);
            
            
            
            
        }
    }
}