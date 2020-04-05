package Hashing;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

class DigitalDictionary{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
     
        HashSet<String> h = new HashSet<>();
     
        while(N-->0){
          
            h.add(br.readLine());

        }
         int q =Integer.parseInt(br.readLine().trim());
         StringBuilder str = new StringBuilder();
         while(q-->0){
     
             String tmp=br.readLine();
             Iterator iter = h.iterator();
             ArrayList<String> lst = new ArrayList<>();
             while(iter.hasNext()){
                 String wrd= (String) iter.next();
                 if(wrd.length()>=tmp.length()){
                    if(wrd.substring(0,tmp.length()).equals(tmp)){
                        lst.add(wrd);
                    }
                 }
                

             }
             Collections.sort(lst);
             for(int k=0;k<lst.size();k++){
                 str.append(lst.get(k)+'\n');
             }
             if(lst.size()==0){
                 str.append("No suggestions"+'\n');
             }
           
         }
         System.out.print(str);
    
    }
}