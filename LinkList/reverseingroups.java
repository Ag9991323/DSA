package LinkList;

public class reverseingroups {
    Node reverse(Node node,int k){
        Node curr=node;
        Node prev=null;
        Node next=node;
        int count=0;

        while(curr!=null&&count<k){
            next=curr.Next;
            curr.Next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            Node reshead=reverse(next,k);
            node.Next=reshead;
        }
   
        return prev;
    }

}