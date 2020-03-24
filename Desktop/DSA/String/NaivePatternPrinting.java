package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class NaivePatternPrinting{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        while(t-- >0){
            String s=br.readLine();
            String p =br.readLine();
            if(s.indexOf(p)!=-1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}