package Sorting;
import java.util.*;
class MergeSort{
   
    void Merging(int arr[],int l,int m,int r){
        int temp[] =new int[r+1];
       
      
       
        int i=l,j=m+1;
        int k=l;
        while(i<=m&&j<=r){
            if(i>0&&arr[i]==arr[i-1]){
                i++;
                continue;
            }
            else if(arr[i]>arr[j]){
                temp[k++]=arr[j++];
            }
            else if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[i++];
                temp[k++]=arr[j++];
            }
        }
        while(i<=m){
            
                temp[k++]=arr[i++];
            
        }
        while(j<=r){
           
                temp[k++]=arr[j++];
            
        }
        for(int p=l;p<=r;p++){
            arr[p]=temp[p];
        }
        //System.out.println("left"+  Arrays.toString(left));
       // System.out.println("right "+  Arrays.toString(right));
        //System.out.println(Arrays.toString(arr));
      
    }
   void Merge(int arr[],int n,int l,int r){
       if(r>l){
        int m=l+(r-l)/2;
        Merge(arr,n,l,m);
        Merge(arr,n,m+1,r);
         Merging(arr,l,m,r);
       }
      
       
   }

}