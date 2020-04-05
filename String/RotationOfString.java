package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class RotationOfString{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        while(t-- >0){
            String s=br.readLine();
            String p =br.readLine();
            s=s+s;
            System.out.println(s.indexOf(p)>=0);

           
            
        }

    }
}