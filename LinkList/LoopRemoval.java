package LinkList;
public class LoopRemoval {

    void Loop(Node head){
        Node first =head;
        Node second =head;
        while(second!=null&&second.Next!=null){
            first= first.Next;
            second = second.Next.Next;
            if(first==second){
                break;
            }
        }
        if(first!=second){
            return;
        }
        first =head;
        while(first.Next!=second.Next){
            first=first.Next;
            second=second.Next;
        }
        second.Next=null;
        return ;
    }

}