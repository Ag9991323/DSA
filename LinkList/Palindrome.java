package LinkList;

public class Palindrome {

    int palin(Node head){
        int size=0;
        Node curr = head;
     
        while(curr!=null){
            size++;
            curr= curr.Next;
        }
    
      Node  prev = head;
    
        for(int i=0;i<size/2;i++){
            prev=prev.Next;
        }
        curr=prev;
        prev=null;
       // System.out.println(prev.data);

        
        while(curr!=null){
            Node next = curr.Next;
            curr.Next=prev;
            prev= curr;
            curr=next;
        }
        curr = head;
        int num= (int)Math.ceil((double)size/2);
       // System.out.println(num);
     
        while(curr!=null&&prev!=null&&curr.data==prev.data){
         //   System.out.println(curr.data+"    ---"+prev.data);
            curr=curr.Next;
            prev=prev.Next;
            num--;
        }
        if(num==0){
            return 1;
        }
        else{
            return 0;
        }
    }

}