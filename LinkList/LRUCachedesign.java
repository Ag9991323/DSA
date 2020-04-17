package LinkList;

import java.util.HashMap;
import java.util.Scanner;

class Nodes{
    int data;
    Nodes next;
    Nodes prev;
    Nodes(int data){
        this.data = data;
     }
}
class Linklist{
    Nodes head;
    Nodes tail;
     int size=0;
    void insertAtBegining(int x,int cache){
        size++;
        Nodes n = new Nodes(x);
        if(head==null) {
            head = n;
           tail= head;
         
          
           return;
        }
       
        head.prev=n;
        n.next= head;
        head = n;
       
        if(size>cache){
            LRUCachedesign.map.remove(tail.data);
            tail.prev.next=null;
            tail=tail.prev;
            size--;

        }
    
       
    }
    //1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5

    void printlist(){
        Nodes curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ->");
            curr= curr.next;
        }
        System.out.println();
      }
      void hit(Nodes add,int cache){
          if(add.prev==null){
            
          }
          add.prev.next=add.next;
          insertAtBegining(add.data,cache);
          
      }
      void miss(int x,int cache){
         
          insertAtBegining(x,cache);
         
          LRUCachedesign.map.put(x, head);
      }
}

public class LRUCachedesign {
    static HashMap<Integer,Nodes> map = new HashMap<>();

    public static void main(String[] args){
        Linklist l = new Linklist();
        Scanner scan = new Scanner(System.in);
       
        int cache =3;
        for(int i=0;i<12;i++){
        int value =scan.nextInt();
        if(map.containsKey(value)){
            l.hit(map.get(value),cache);
        }
        else{
             l.miss(value, cache);
          
        }
        
        l.printlist();
    }
       
    }
  
    

}