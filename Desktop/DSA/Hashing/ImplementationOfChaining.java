package Hashing;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
class MyHash {
    
    public static void main(String[] args){
        ArrayList <Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(1);
        lst.add(2);
      
     HashSet<Integer> h = new HashSet<>();
     h.addAll(lst);
     System.out.println(h.remove("ck")+"    "+h.remove("ck"));
     Iterator i =h.iterator();
      while(i.hasNext()){
          System.out.println(i.next()+"  "+i.hashCode());
      }
     

    }

}