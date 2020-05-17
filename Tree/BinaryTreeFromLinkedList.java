/*class Tree{
int data;
    Tree left;
    Tree right;
    Tree(int d){
        data=d;
        left=null;
        right=null;
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class BinaryTreeFromLinkedList{
    public static Tree convert(Node head, Tree node) {
        if(head==null) return null;
        Node curr = head; 
      Deque<Tree> dq = new LinkedList<>();
      node = new Tree(curr.data);
      dq.addLast(node);
      curr= curr.next;
      while(curr!=null){
          Tree left = null;
          Tree right = null;
          Tree temp =  dq.removeFirst();
          if(curr!=null)
          {
              left = new Tree(curr.data);
              curr= curr.next;
          }
          if(curr!=null){
              right = new Tree(curr.data);
              curr = curr.next;
          }
          temp.left= left;
          temp.right = right;
           if(temp.left!=null) dq.addLast(temp.left);
           if(temp.right!=null) dq.addLast(temp.right);
      }
      return node;
      
      
    }
    
}