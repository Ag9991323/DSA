package Queue;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
    }
}

 class implementationLinklist {
     Node front;
     Node rear;
     int size=0;

     void enqueue(int x){
         Node temp = new Node(x);
         if(rear==null){
             front = temp;
             rear = front;
         }
         rear.next=temp;
         rear = rear.next;
         size++;
     }

     void dequeue(){
         if(front==null) return;
         front = front.next;
         if(front==null) rear=null;
         size--;
     }
     void show(){
         Node curr = front;
         while(curr!=null){
             System.out.print(curr.data+" -> ");
             curr=curr.next;
         }
         System.out.println();
     }

}
class Test{
    public static void main(String[] args) {
        implementationLinklist il = new implementationLinklist();
        il.enqueue(25);
        il.enqueue(55);
        il.enqueue(65);
        il.show();
        il.dequeue();
        il.show();
        il.dequeue();
        System.out.println(il.size);
        il.show();
        il.enqueue(100);
        il.show();
        il.dequeue();
        il.show();
        il.dequeue();
        il.show();
        
        il.show();
     

       
    }
}