package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javafx.collections.MapChangeListener;

class SortingElementsByFrequency{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int N=scan.nextInt();
            int arr[] = new int[N];
            HashMap<Integer,Integer> hmap = new HashMap<>();
            int freq=1;
            for(int i=0;i<N;i++){
                arr[i]= scan.nextInt();
                if(hmap.containsKey(arr[i])){
                    int temp=hmap.get(arr[i]);
                    freq=Math.max(freq,temp+1);
                    hmap.put(arr[i],temp+1);
                }
                else{
                    hmap.put(arr[i],1);
                }
            }
           HashMap<Integer,ArrayList> h= new HashMap<>();
           for(Map.Entry<Integer,Integer> e :hmap.entrySet()){
                    if(h.containsKey(e.getValue())){
                        ArrayList <Integer> lst =h.get(e.getValue());
                        lst.add(e.getKey());
                        h.put(e.getValue(),lst);
                    }
                    else{
                        ArrayList <Integer> lst =new ArrayList<>();
                        lst.add(e.getKey());
                        h.put(e.getValue(),lst);
                    }
         }
         StringBuilder str = new StringBuilder();
         for(int i=freq;i>0;i--){
             if(h.containsKey(i)){
                 ArrayList <Integer> lst =new ArrayList<>();
                 lst.addAll(h.get(i));
                    Collections.sort(lst);
                    //System.out.println(lst.get();
                    for(int j=0;j<lst.size();j++){
                        int temp=i;
                        while(temp-->0){
                            str.append(lst.get(j)+" ");
                        }
                        
                    }
             }
         }
       //  System.out.println(freq);
         System.out.println(str);
        }
    }
}