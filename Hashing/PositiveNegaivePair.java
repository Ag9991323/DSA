package Hashing;
import java.util.*;

import java.io.*;


class PositiveNegative{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine().trim());
        while(t-- >0){
            int N=Integer.parseInt(br.readLine().trim());
            int arr[]= new int[N];
            
            StringTokenizer token = new StringTokenizer(br.readLine());
          
           int max= 0;
           HashSet<Integer> hashset= new  HashSet<>();
           ArrayList<Integer> lst = new ArrayList<>();
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(token.nextToken());
                hashset.add(arr[i]);
            }
            for(int i=0;i<N;i++){
                if(arr[i]>0&&hashset.contains(-arr[i])){
                    lst.add(arr[i]);
                    hashset.remove(-arr[i]);
                    hashset.remove(arr[i]);

                }
            }
            Collections.sort(lst);
            StringBuilder str = new StringBuilder();
            for(int i=0;i<lst.size();i++){
                str.append(lst.get(i)+" ");

                str.append((-lst.get(i))+" ");
            }
           
           if(str.length()==0){
               str.append(0);
           }
          System.out.println(str);
            
            
            
            
        }
    }
}