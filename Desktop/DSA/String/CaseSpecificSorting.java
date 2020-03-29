package String;

import java.util.Scanner;

class CaseSpecificSorting{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while(t-- >0){
            int N= scan.nextInt();
            String s = scan.next();
            int upper[]=new int[26];
            int lower[]= new int[26];
            for(int i=0;i<s.length();i++){
                int temp=s.charAt(i);
                if(temp>64&&temp<91){
                    upper[temp-65]+=1;
                }
                else{
                    
                    lower[temp-97]+=1;
                }
            }
            StringBuilder str = new StringBuilder();
            int k=0,j=0;
            for(int i=0;i<s.length();i++){
                int temp=s.charAt(i);
                if(temp>90){
                    for(int l=0;l<26;l++){
                        if(lower[l]>0){
                            str.append((char)(l+97));
                            lower[l]-=1;
                            break;
                        }
                    }
                }
                else{
                    for(int l=0;l<26;l++){
                        if(upper[l]>0){
                            str.append((char)(l+65));
                            upper[l]-=1;
                            break;
                        }
                    }
                }

            }
            System.out.println(str);
        }
    }
}