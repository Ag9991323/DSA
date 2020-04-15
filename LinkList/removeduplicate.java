package LinkList;

import java.util.HashSet;

public class removeduplicate {

    Node duplicate(Node head){
        HashSet<Integer>  h= new HashSet<>();
       
        if(head==null&&head.Next==null){
            return head ;
        }
        h.add(head.data);
        Node prev = head;
        Node curr= head.Next;
        while(curr!=null){
            if(!h.contains(curr.data)){
                h.add(curr.data);
                prev= curr;
                curr=curr.Next;
            }
            else{
                prev.Next=curr.Next;
                curr=curr.Next;
            }

        }
        return head;
    }

}