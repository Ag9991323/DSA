package LinkList;

public class PairWiseSwapping {

   Node swapping(Node head){
        // Node curr= head;
        // while(curr!=null&&curr.Next!=null){

        //     int temp=curr.Next.data;
        //     curr.Next.data=curr.data;
        //     curr.data=temp;
        //     curr=curr.Next.Next;
        // }
        if(head==null||head.Next==null){
            return head;
        }
        
        Node prev= head;
        Node curr= head.Next;
        prev.Next=curr.Next;
        curr.Next= prev;
        head = curr;
        curr = prev.Next;
        //return head;
        while(curr!=null&&curr.Next!=null){
            prev.Next = curr.Next;
            Node temp = prev.Next.Next;
            prev.Next.Next=curr;
            curr.Next=temp;
            prev = curr;
            curr = temp;
        }
        return head;
    }

}