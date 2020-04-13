package LinkList;

public class PairWiseSwapping {

   void swapping(Node head){
        Node curr= head;
        while(curr!=null&&curr.Next!=null){

            int temp=curr.Next.data;
            curr.Next.data=curr.data;
            curr.data=temp;
            curr=curr.Next.Next;
        }
        
    }

}