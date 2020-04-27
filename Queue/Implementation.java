package Queue;
import java.util.*;
class Queu{
    int front=0;
    int rear =0;
    int size=0;
    int cap =0;
    int arr[];
        Queu(int c){
            cap=c;
            arr = new int[cap];
            
        }
        void enqueue(int c){
            if(size==cap) return ;
            arr[rear]=c;
            rear=(rear+1)%cap;
            size++;
        }
        void dequeue(){
            if(size==0) return ;
            arr[front]=0;
            front=(front+1)%cap;
            size--;
        }
}

class  implementation{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        
          Queu q = new Queu(4);
          q.enqueue(25);
          System.out.println(Arrays.toString(q.arr));
          q.enqueue(5);
          System.out.println(Arrays.toString(q.arr));
          q.dequeue();
          q.enqueue(17);
          q.enqueue(16);
          q.enqueue(4);
          q.enqueue(5);
          System.out.println(Arrays.toString(q.arr));
          q.enqueue(6);
          System.out.println(Arrays.toString(q.arr));
          q.dequeue();
          System.out.println(Arrays.toString(q.arr));
          System.out.println(q.arr[q.front]);
          q.dequeue();
          q.enqueue(20);
          q.enqueue(20);
          q.dequeue();
          System.out.println(Arrays.toString(q.arr));
        
          
          
   }
}