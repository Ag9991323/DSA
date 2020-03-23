package Sorting;

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class IntersectionOfSortedArrays{

    static StringBuilder merge(int arr[], int arr2[],int m ,int n){
        StringBuilder str = new StringBuilder();
         int i=0,j=0;
       while(i<m&&j<n){
        if(i>0&&  arr[i]==arr[i-1]){
            i++;
            continue;
        }
        else if(arr[i]>arr2[j]){
            j++;
        }
        else if(arr[i]<arr2[j]){
            i++;
        }
        else{
            str.append(arr[i]+" ");
            i++;
            j++;
        }

       }
       if(str.length()==0){
           str.append(-1+" ");
       }
       return str;
       
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
      // int m= scan.nextInt();
        //int arr2[] = new int[m];
        int r= scan.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        MergeSort mer = new MergeSort();
        mer.Merge(arr, n, 0, r);
        System.out.println(Arrays.toString(arr));
        // for(int i=0;i<m;i++){
        //     arr2[i]=scan.nextInt();
        // }
        // StringBuilder arr3 =merge(arr, arr2, n, m);
        // System.out.println(arr3);
       

       
        
    }
}