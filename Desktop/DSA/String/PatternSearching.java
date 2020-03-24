package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class PatternSearching{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        while(t-- >0){
            String s=br.readLine();
            String p =br.readLine();
            StringBuilder str = new StringBuilder();
            str.append(s.substring(0,p.length()));
            System.out.println(str+"   "+p);
            String st=str.toString();
            if(st.equals(p)){
                System.out.print(0+" ");
            }
            
                for(int i=p.length();i<s.length();i++){
                    str.re
                    st=str.toString();
                    
                    if(st.equals(p)){
                        System.out.println(i+" ");
                    }
                
            }

           
            
        }

    }
}