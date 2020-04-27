
package Arrays;
import java.math.BigInteger;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int x){
        this.data = x;
     }
}
class LinkList{
    //hello world
    Node head;
    void insertAtEND(int x){
        Node temp = new Node(x);
        if(head==null){
            head = temp;
            return ;
        }
        Node curr = head;
        while(curr.next!=null){
            curr= curr.next;
        }
        curr.next=temp;
    }
    void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ->");
            curr=curr.next;
        }
        System.out.println();
    }
}



class  addtwonumber{

    static Node sum(Node h1,Node h2){
       
        Node curr1 = h1;
        Node curr2= h2;
        int carry =0;
        int size1=0;
        int size2=0;
        while(curr1!=null){
            curr1=curr1.next;
            size1++;
        }
        while(curr2!=null){
            curr2=curr2.next;
            size2++;
        }
        boolean rev=false;
        if(size2>size1){
            curr1 = h2;
            curr2= h1;
           rev=true;
        }
        else{
            curr1 = h1;
            curr2= h2;
        }
     
        while(size1>0&&size2>0){
           
            int num1=curr1.data;
            int num2= curr2.data;
            int sum= num1+num2+carry;
            if(sum>9){
                carry=1;
                sum%=10;
            }
            else carry =0;

            curr1.data=sum;
            size1--;
            size2--;
            if(size1==0&&size2==0&&carry==1){
                curr1.next= new Node(1);
            }
            curr1=curr1.next;
            curr2=curr2.next;
      }
      while(size1>0){
        int num1=curr1.data;
        int sum= num1+carry;
        if(sum>9){
            carry=1;
            sum%=10;
        }
        else carry =0;

        curr1.data=sum;
        size1--;
      
        if(size1==0&&size2==0&&carry==1){
            curr1.next= new Node(1);
        }
        curr1=curr1.next;
      }
      while(size2>0){
        int num1=curr1.data;
        int sum= num1+carry;
        if(sum>9){
            carry=1;
            sum%=10;
        }
        else carry =0;

        curr1.data=sum;
        
        size2--;
        if(size1==0&&size2==0&&carry==1){
            curr1.next= new Node(1);
            
        }
        curr1=curr1.next;
      }
    

      return rev==true?h2:h1;


    }
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          LinkList l1 = new LinkList();
          LinkList l2 = new LinkList();
          l1.insertAtEND(2);
          l1.insertAtEND(3);
        //  l1.insertAtEND(2);
        

//          l2.insertAtEND(1);
         // l2.insertAtEND(1);
          //l2.insertAtEND(1);
          //l2.insertAtEND(2);
         

      Node head= sum(l1.head,l2.head);


          l2.print(head);
        

         
          
   }
}
