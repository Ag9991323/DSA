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
        Insertion q = new Insertion();
        reverseingroups r = new reverseingroups();
        RemoveduplicateNode rt= new RemoveduplicateNode();
        SeggregatEvenOdd sg = new SeggregatEvenOdd();
        PairWiseSwapping pg = new PairWiseSwapping();
        RotateLinkList rs = new RotateLinkList();
        MergeTwoSortedLL mt = new MergeTwoSortedLL();
        AdditionOfTwoLL at= new AdditionOfTwoLL();
        Palindrome pl = new Palindrome();
        removeduplicate rd = new removeduplicate();
        SwapNthNode  sd= new SwapNthNode();
        LinkListOf012 ll = new LinkListOf012();
        q.insertatEnd(0);
       q.insertatEnd(1);
       // q.insertatEnd(4);
        q.insertatEnd(2);
        q.insertatEnd(1);
        q.insertatEnd(2);
     //   q.insertatEnd(0);
       // i.insertatEnd(4);
        //q.insertatEnd(2);610 484 829 927 868 63
        //q.insertatEnd(4);
       // i.insertatEnd(5);
       // i.insertatEnd(8);
        //i.insertatEnd(9);
       //i.insertatEnd(40);
        //i.printLinkList();
        q.printLinkList();
       // i.printLinkList();
        q.head=ll.List012(q.head);
      // System.out.println(pl.palin(q.head));
    
       //rd.removeDuplicates(i.head);
      // i.head=pg.swapping(i.head );
       q.printLinkList();
       //pg.swapping(i.head);

    //    i.head=r.reverse(i.head,3);

     //  i.printLinkList();
   
    }
}