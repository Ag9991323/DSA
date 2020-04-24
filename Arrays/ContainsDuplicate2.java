package Arrays;

import java.util.*;
class  ContainsDuplicate{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int k = scan.nextInt();
          int arr[] =  new int[N];
          for(int i=0;i<N;i++)
               arr[i]= scan.nextInt();


          HashSet<Integer> map = new HashSet<>();
          for(int i=0;i<k&&i<N;i++){
              if(map.contains(arr[i]))
                  System.out.println(true);
              else map.add(arr[i]);
          } 
          for(int j=0,l=k+1;l<N;l++,j++){
              if(map.contains(arr[l])) {
                    System.out.println(true);
                    break;
              }
              else{
                  map.add(arr[l]);
                  map.remove(arr[j]);
              
              }

          }    
          }
   }
}