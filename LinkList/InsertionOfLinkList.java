package LinkList;
import java.util.*;

class Insertion{
    Node head;

    void insertAtBegining(int x){
        Node curr = new Node(x);
        curr.Next=head;
        head=curr;
        return;
    }
    void printLinkList(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ->");
            curr=curr.Next;
        }
        System.out.println();
    }
    void insertatEnd(int x){
        Node temp= new Node(x);
        if(head==null){
            head=temp;
            return;
        }
        Node curr= head;
        while(curr.Next!=null){
            curr=curr.Next;
        }
        curr.Next=temp;
        return;
    }
    void insertAtMiddle(int x){
        Node temp = new Node(x);
        if(head==null){
            head=temp;
            return;
        }
        if(head.Next==null){
            head.Next=temp;
            return;
        }
        Node first=head;
        Node second=head;
        Node prev=head;
        while(second!=null&&second.Next!=null){
            second=second.Next.Next;
            prev=first;
            first=first.Next;
        }
        if(second==null){
            temp.Next=prev.Next;
            prev.Next=temp;
            return;
        }
        temp.Next=first.Next;
            first.Next=temp;
            return;
      
    }

}
class Main{
    public static void main(String[] args) {
        Insertion i = new Insertion();
        reverseingroups r = new reverseingroups();
        RemoveduplicateNode rd= new RemoveduplicateNode();
        //i.insertatEnd(10);
        i.insertatEnd(20);
        i.insertatEnd(20);
        // i.insertatEnd(20);
        // i.insertatEnd(30);
        // i.insertatEnd(30);
       // i.insertatEnd(40);
        i.printLinkList();
    //    i.insertAtMiddle(5);
       i.printLinkList();
       rd.removeDuplicates(i.head);
    //    i.head=r.reverse(i.head,3);

       i.printLinkList();
   
    }
}