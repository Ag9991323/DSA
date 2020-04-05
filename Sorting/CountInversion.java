package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CountInversion{
    static int Inversion(int arr[],int n,int l,int r){
        int res=0;
        int temp[]= new int[r+1];
        int m =l+(r-l)/2;
        int i=l,j=m+1,k=l;
        while(i<=m&&j<=r){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
                

            }
            else{
                temp[k++]=arr[j++];
                res+=(m-l+1-i);
            }
        }
        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }
        //System.out.println(Arrays.toString(temp));
        for(int p=l;p<=r;p++){
            arr[p]=temp[p];
        }
        return res;
    }
    static int  Mergesort(int arr[],int n,int l,int r){
       int res=0;
        if(r>l){
            int mid =l+(r-l)/2;
           res+= Mergesort(arr, n, l, mid);
           res+= Mergesort(arr, n, mid+1, r);
            res+=Inversion(arr, n, l, r);
            
        }
        return res;
    
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n =Integer.parseInt(str);
        int arr[ ]= new int[n];
        str = br.readLine();
        StringTokenizer token = new StringTokenizer(str);
        int i=0;
        while(token.hasMoreTokens()){
            arr[i]=Integer.parseInt(token.nextToken());
            i++;
        }
        int res=Mergesort(arr, n, 0, n-1);
        System.out.println(res);
        System.out.println(Arrays.toString(arr));
    }
}