
package LinkList;

public class MergeTwoSortedLL {

    Node Marge(Node head1,Node head2){
        Node curr =  head1;
        Node curr2= head2;
        Node tail;
        Node head;
        
        if(head1==null) return head2;
        
        else if(head2==null) return head2;
        int num1= head1.data;
        int num2 = head2.data;
        if(num2<num1){
            head=curr2;
            tail= head;
            curr2=curr2.Next;
        }
        else{
            head=curr;
            tail= head;
            curr=curr.Next;
        }
        while(curr!=null&&curr2!=null){
            if(curr.data>curr2.data){
                tail.Next=curr2;
                tail= tail.Next;
                curr2=curr2.Next;

            }
            else{
                tail.Next=curr;
                tail= tail.Next;
                curr=curr.Next;

            }
        }
        while(curr!=null){
            tail.Next=curr;
            tail=tail.Next;
            curr = curr.Next;
        }
        while(curr2!=null){
            tail.Next=curr2;
            tail=tail.Next;
            curr2= curr2.Next;
        }
        return head;



    }

}