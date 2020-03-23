package Matrix;
import java.util.*;
import java.lang.*;
import java.io.*;
class Ashu
 {
     
	public static void main (String[] args) throws Exception
	 {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      System.out.print(t);
	  while(t-- >0){
        String input=br.readLine().trim();
        int N=0;
        if(input!=null && !input.equals(""))
        {
         N =  Integer.parseInt(input);
        }
	      
	      int [] arr=new int[N];
	      StringTokenizer token = new StringTokenizer(br.readLine());
	      for(int i=0;i<N;i++){
	          arr[i]=Integer.parseInt(token.nextToken());
	      }
	      int start=0,end=N-1;
	      int ans=-1;
	      while(start<=end){
	          int mid=start+(end-start)/2;
	          if(mid==N-1||mid==0||(arr[mid]>arr[mid+1]&&arr[mid-1]<arr[mid])){
	              ans=mid;
	              break;
	          }
	          else if(arr[mid]>arr[mid-1]){
	              start=mid+1;
	            }
	            else{
	                end=mid-1;
	            }
	             
	      }
	    
	        System.out.println(ans);
	             System.out.println(arr[ans]);
	      
	  }
	     
	 
 }
     
 }
