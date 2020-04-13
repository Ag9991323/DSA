package LinkList;
class SeggregatEvenOdd{

  Node seggregate(Node head){
        Node curr = head;
        Node Es=null;
        Node Ee = null;
        Node Os=null;
        Node Oe =null;
        while(curr!=null){
            if((curr.data)%2==0){
                if(Es==null){

                    Es=curr;
                    Ee=Es;
                }
                else{
                    Ee.Next=curr;
                    Ee=Ee.Next;
                   
                }
            }
            else{
                if(Os==null){
                    Os=curr;
                    Oe=Os;
                }
                else{
                    Oe.Next=curr;
                    Oe=Oe.Next;
                }
            }
            curr=curr.Next;
        }
        if(Es ==null ||Os==null){
            return head;
        }
        Ee.Next=Os;
        Oe.Next=null;
        return Es;
    }
}