package LinkList;

public class RotateLinkList {

    Node rotate(Node head,int n){
        Node first= head;
        Node second = head;
    
       Node temp = head;
       int i=0;
        for(;second!=null&&i<n;second=second.Next){
            i++;
        }
     
        temp= second;
        Node one = head;
        while(one.Next!=temp){
            one = one.Next;
        }
        one.Next=null;
        for(;temp.Next!=null;temp=temp.Next);
        temp.Next=head;
      

        return second;
       
        
    }

}