package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Anagram{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        while(t-- >0){
            String s=br.readLine();
            String p =br.readLine();
            int count[]= new int[26];
            for(int i=0;i<p.length();i++){
                count[s.charAt(i)-'a']+=1;
                count[p.charAt(i)-'a']-=1;
            }
            boolean anagram=true;
            for(int i=0;i<26;i++){
                if(count[i]!=0){
                    anagram =false;
                    break;
                }
            }
            if(!anagram ){
                
                for(int i=p.length();i<s.length();i++){
                     anagram=true;
                    count[s.charAt(i-p.length())-'a']-=1;
                    count[s.charAt(i)-'a']+=1;
                   
                    for(int j=0;j<26;j++){
                        if(count[j]!=0){
                            anagram =false;
                            break;
                        }
                    }
                  
                    if(anagram ==true){
                       
                        break;
                    }

                }
            }
            System.out.println(anagram);

           
            
        }

    }
}