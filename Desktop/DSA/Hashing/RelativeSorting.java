package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class RelativeSorting{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        while(t-- >0){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int m =Integer.parseInt(token.nextToken());
            int n =Integer.parseInt(token.nextToken());
            int arr1[]=new int[m];
            int arr2[]=new int[n];
            token =new StringTokenizer(br.readLine());
            HashMap<Integer,Integer> h= new HashMap<>();
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                arr1[i]=Integer.parseInt(token.nextToken());
                min=Math.min(min,arr1[i]);
                max=Math.max(max,arr1[i]);
                if(h.containsKey(arr1[i])){
                    h.put(arr1[i],h.get(arr1[i])+1);
                }
                else{
                    h.put(arr1[i],1);
                }
            }
            token =new StringTokenizer(br.readLine());
            StringBuilder str = new StringBuilder();
            for(int i=0;i<n;i++){
                arr2[i]=Integer.parseInt(token.nextToken());
                    if(h.containsKey(arr2[i])){
                    int freq=h.get(arr2[i]);
                    while(freq-->0){
                        str.append(arr2[i]+ " ");
                    }
                 
                    h.remove(arr2[i]);
                    
                }
            }
            ArrayList <Integer> lst = new ArrayList<>();
            for(Map.Entry<Integer,Integer> e:h.entrySet()){
                int num=e.getKey();
                int freq= e.getValue();
                while(freq-->0){
                    lst.add(num);
                }
            }
            Collections.sort(lst);
            for(int i=0;i<lst.size();i++){
                str.append(lst.get(i)+" ");
            }
            System.out.println(str);

            
        }
    }
}