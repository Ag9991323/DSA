package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class CountNonRepeatedElements{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- >0){
            int n=Integer.parseInt(br.readLine().trim());
            StringTokenizer token=new StringTokenizer(br.readLine());
            HashMap<Integer,Integer> hmap = new HashMap<>();
            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                int temp= Integer.parseInt(token.nextToken());
                arr[i]=temp;
                if(hmap.containsKey(temp)){
                    hmap.put(temp,hmap.get(temp)+1);
                }
                else{
                    hmap.put(temp,1);
                }
            }
            
            StringBuilder str = new StringBuilder();
           for(int i=0;i<n;i++){
               if(hmap.get(arr[i])==1){
                   str.append(arr[i]+" ");
               }
           }
            System.out.println(str);

        }
    }
}