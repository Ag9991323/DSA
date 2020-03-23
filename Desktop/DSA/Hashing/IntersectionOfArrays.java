package Hashing;
import java.io.BufferedReader;
import java.util.*;
import java.io.*;
class IntersectionOfArrays{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine().trim());
        while(t-- >0){
            StringTokenizer token= new StringTokenizer(br.readLine());
            int m =Integer.parseInt(token.nextToken());
            int n =Integer.parseInt(token.nextToken());
            HashSet<Integer> h= new HashSet<>();
            token= new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++){
                h.add(Integer.parseInt(token.nextToken()));
            }
            int count=0;
            token= new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                int temp=Integer.parseInt(token.nextToken());
                if(h.contains(temp)){
                    count++;
                    h.remove(temp);
                
                }
            }
            System.out.println(count);
        }
    }
}