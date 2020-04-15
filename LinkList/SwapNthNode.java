package LinkList;
class SwapNthNode{
    Node swap(Node head,int k,int n){
       if(k>n){
           return head;
       }
       Node start = head;
       Node end = head;
      
       for(int i=1;i<k-1;i++) start= start.Next;
       for(int i=1;i<n-k;i++) end = end.Next;
       System.out.println(end.data);
       if(k==1){
         Node temp = start.Next;
         Node temp2= end.Next;
           end.Next=start;
           start.Next=null;
           temp2.Next=temp;
           head= temp2;
        }
        else if(k==n){
            Node temp = start.Next;
            Node temp2= end.Next;
              end.Next=null;
              start.Next=end;
              temp.Next=temp2;
              head= temp;

        }
        else if(k==n/2){
            Node temp = start.Next;
            Node temp2 = end.Next;
            end.Next= end.Next.Next;
            temp2.Next= end;
            start.Next= temp2;
            
         
        }
        else{
            Node temp= start.Next.Next;
            Node temp2 = end.Next;
            end.Next=start.Next;
            end.Next.Next=temp2.Next;
            temp2.Next=temp;
            start.Next=temp2;
       }
      

      return head;
    

    }
}