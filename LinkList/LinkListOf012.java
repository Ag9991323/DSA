package LinkList;

public class LinkListOf012 {

    Node List012(Node head){
        Node curr = head;
        Node start0=null;
        Node start1= null;
        Node start2=null;
        Node end1= null;
        Node end0=null;
        Node end2= null;
        while(curr!=null){

            if(curr.data==0){

                if(start0==null){
                    start0= new Node(0);
                    end0=start0;
                }
                else {
                    end0.Next = curr;
                    end0= end0.Next;
                }
            }
            if(curr.data==1){

                if(start1==null){
                    start1= new Node(1);
                    end1=start1;
                }
                else {
                    end1.Next = curr;
                    end1= end1.Next;
                }

        }
        if(curr.data==2){

            if(start2==null){
                start2= new Node(2);
                end2=start2;
            }
            else {
                end2.Next = curr;
                end2= end2.Next;
            }
        }
         curr = curr.Next;
        }
        if(start2!=null) end2.Next=null;
        if(start1!=null)end1.Next=start2; 
        else if(start0!=null) end0.Next=start2;
    
      

        if(start0!=null&&start1!=null){
           
            head = start0;
            end0.Next=start1;
        }
        else if(start0!=null&&start1==null){
            head=start0;
            end0.Next=start2;
        }
        else if(start1!=null){
            head = start1;
            end1.Next=start2;
        }
        else{
            head = start2;

        }
        return head;


}
}