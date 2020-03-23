package Hashing;
import java.util.*;
class LongestConsecutiveSubsequence{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){

            int n = scan.nextInt();
            int arr[] = new int[n];
            HashSet<Integer> h = new HashSet<Integer>();
            for(int i=0;i<n;i++){
                arr[i]= scan.nextInt();
                h.add(arr[i]);
            }
            int maxlen=0;
         
            for(int i=0;i<n;i++){
                int temp=arr[i];
                int currlen =0;
                if(!h.contains(arr[i]-1)){
                    while(h.contains(arr[i]+currlen)){
                        currlen++;
                    }
                    maxlen=Math.max(maxlen,currlen);
                }
            }
            System.out.println(maxlen);
        }
       
       
    }
}