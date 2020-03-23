package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

class Union{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        
        String str = br.readLine();
        Integer m =Integer.parseInt(str);
        str= br.readLine();
        int n = Integer.parseInt(str);
        int arr[]= new int[m];
        int arr2[] = new int[n];
        str= br.readLine();
        StringTokenizer token= new StringTokenizer(str);
        int i=0;
        while(token.hasMoreTokens()){
           arr[i]=Integer.parseInt(token.nextToken());
           i++;
        }
        str= br.readLine();
         token= new StringTokenizer(str);
        i=0;
        while(token.hasMoreTokens()){
           arr2[i]=Integer.parseInt(token.nextToken());
           i++;
        }
     
        i=0;
        int j=0;
        StringBuilder string = new StringBuilder();

        while(i<m&&j<n){
          
            if(i<m&&j<n){

                if(i>0&&arr[i]==arr[i-1]){
                    i++;
                    continue;
                }
                else if(j>0&&arr2[j]==arr2[j-1]){
                    j++;
                    continue;
                }
                else if(arr[i]>arr2[j]){
                    string.append(arr2[j++]+" ");
                }
                else if(arr[i]<arr2[j])
                    string.append(arr[i++]+" ");
                else{
                    string.append(arr[i++]+" ");
                    j++;
                }    
            }
        }
       // System.out.println(string);
            while(j<n){
                if(j>0&&arr2[j]==arr2[j-1]){
                    j++;
                    continue;
                }
                else{
                    string.append(arr2[j++]+" ");
                }
            }
        //System.out.println(string);
            while(i<m){
                if(i>0&&arr[i]==arr[i-1]){
                    i++;
                    continue;
                }
                else{
                    string.append(arr[i++]+" ");
                }
            }
            
        
        System.out.println(string);

    }
}