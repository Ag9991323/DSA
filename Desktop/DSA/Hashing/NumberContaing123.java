package Hashing;
import java.util.*;

import java.io.*;


class NumberContaining123{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine().trim());
        while(t-- >0){
            int N=Integer.parseInt(br.readLine().trim());
            int arr1[]= new int[N];
            
            StringTokenizer token = new StringTokenizer(br.readLine());
            HashMap<Integer,Integer> hset = new HashMap<>();
           int max= 0;
            for(int i=0;i<N;i++){
                arr1[i]=Integer.parseInt(token.nextToken());
                if(hset.containsKey(arr1[i])){
                    hset.put(arr1[i],hset.get(arr1[i])+1);
                }
                else{
                    hset.put(arr1[i],1);
                }
               
                max=Math.max(max,arr1[i]);
            }
            StringBuilder str = new StringBuilder();
            for(int i=1;i<=max;i++){
                int temp=i;
                boolean isgood=false;
                while(temp>0){
                    int num=temp%10;
                    if(num==1||num==2||num==3){
                        temp/=10;
                        isgood=true;
                    }
                    else{
                        isgood=false;
                        break;
                    }
                }
                if(isgood&&hset.containsKey(i)){
                    int num=hset.get(i);
                    while(num-->0){
                        str.append(i+" ");
                    }
                 
                }
                    
                }
                if(str.length()==0){
                    str.append(-1);
                }
                System.out.println(str);
            }
            
            
            
            
            
        }
    }
