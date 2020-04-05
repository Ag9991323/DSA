package Infosys;
import java.util.*;
class easy{
       static void fun(String str,String curr,int index){
           if(index==str.length()){
               System.out.println(curr);
               return ;
           }
           fun(str,curr,index+1);
           fun(str,curr+str.charAt(index),index+1);
       }

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        fun("ABC","",0);
        


        }

    }

