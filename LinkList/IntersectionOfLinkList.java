package LinkList;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfLinkList {
    Node intersection(Node head,Node head2){
        Node curr= head;
        HashSet<Node > hs = new HashSet<>();
        for(;curr!=null;curr=curr.Next){
            hs.add(curr);
        }
        curr=head2;
        for(;curr!=null;curr=curr.Next){
            if(hs.contains(curr)){
                return curr;
            }
        }
        return null;
        
    }

}