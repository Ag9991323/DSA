package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class WinnersOfElection{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        while(t-- >0){
            int N= Integer.parseInt(br.readLine());
            StringTokenizer token = new StringTokenizer(br.readLine());
            String[] arr = new String[N];
            HashMap<String,Integer> h = new HashMap<>();
            int max=1;
            for(int i=0;i<N;i++){
                arr[i]=token.nextToken();
                if(h.containsKey(arr[i])){
                    int num=h.get(arr[i])+1;
                    max=Math.max(max,num);
                    h.put(arr[i],num);
                }
                else{
                    h.put(arr[i],1);
                }
            }
            ArrayList<String> lst = new ArrayList<>();
            for(Map.Entry<String,Integer> map:h.entrySet()){
                if(map.getValue()==max){
                    lst.add(map.getKey());
                }
            }
            Collections.sort(lst);
            System.out.println(lst.get(0)+" "+max);
            
         


        }

    }
}