package LinkList;

class Node{
    int data;
    Node Next;
    Node(int d){
        data=d;
    }
}
class List{
    Node head;
    int size;
    void insertAtBegining(int x){
        Node temp = new Node(x);
        temp.Next=head;
        head =temp;
        size+=1;
    }
    void printList(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+ " ->");
            curr=curr.Next;
        }
        System.out.println();
      
    }
    void insertAtLast(int x){
        Node temp = new Node(x);
        if(head==null){
            head=temp;
            return;
        }
        Node curr=head;
        
        while(curr.Next!=null){
            curr=curr.Next;
        }
        size+=1;
        
        
         curr.Next=temp;
       }
       void DeleteFromBegining(){
           if(head!=null){
               Node curr =head.Next;
               head=curr;
           }
           else{
               System.out.println("Already Empty");
           }


       }
       void DeleteFromEnd(){
           Node curr= head;
           if(head!=null){
            while(curr.Next!=null){
                curr=curr.Next;
            }
            
            curr=null;
           
           }
           else{
               System.out.println("Already Empty");
           }
          
       }

       void printmiddle(Node x){
           head =x;
           Node slow=head,fast=head;
           while(fast!=null&&fast.Next!=null){
               slow=slow.Next;
               fast=fast.Next.Next;
           }
           System.out.println(slow.data);
       }

       void NthNodeFromLinkList(int n){
           if(head==null){
               return;
           }
          Node first=head;
          Node second=head;
          for(int i=0;i<n;i++){
              if(first==null){
                  return;
              }
            first=first.Next;
          }
          while(first!=null){
              second=second.Next;
              first =first.Next;
          }
          System.out.println(second.data);
       }

       void ReverseList(){
          if(head==null||head.Next==null){
              return;
          }
          Node curr=head;
          Node prev=null;
          Node next=null;
          while(curr!=null){
              next=curr.Next;
              curr.Next=prev;
              prev=curr;
              curr=next;
             }
             head=prev;
             

          
         

       }
}
class Test{
    public static void main(String[] args){
        List l = new List();
       
       l.insertAtLast(35);
   
        
        l.insertAtLast(50);
     
        l.insertAtLast(60);
     
        l.insertAtLast(70);
        l.insertAtLast(75);
     
        l.insertAtLast(80);
   
        l.printList();
        l.ReverseList();
        l.printList();
       
       
        
    }
}