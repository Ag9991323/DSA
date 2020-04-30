package Tree;

class NodeTree{
    int data;
    NodeTree right;
    NodeTree left;
    NodeTree(int x){
        data=x;
    }
}

class TreeList{
    NodeTree root;
    NodeTree insertionAtLeft(NodeTree root,int x){
      
        NodeTree temp = new NodeTree(x);
        if(root==null){
            this.root = temp;
            return root ;
        }
        while(root.left!=null){
            root=root.left;
        }
        root.left= temp;
        return root.left;
    }
    NodeTree insertionAtRight(NodeTree root,int x){
        NodeTree temp = new NodeTree(x);
        if(root==null){
            this.root = temp;
            return root;
        }
        while(root.right!=null){
            root=root.right;
        }
        root.right= temp;
        return root.right;
    }
}

public class PreorderTraversal {
    static void preorder(NodeTree root){
        if(root!=null){
           // System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args){
        TreeList tl = new TreeList();
        MaximumInBinaryTree mt= new MaximumInBinaryTree();
        tl.insertionAtLeft(tl.root, 10);
        tl.insertionAtLeft(tl.root, 20);
        NodeTree rt=tl.insertionAtLeft(tl.root, 30);
    
        tl.insertionAtLeft(rt, 40);
        tl.insertionAtRight(rt, 50);
        tl.insertionAtRight(rt, 55);
        tl.insertionAtRight(rt, 55);
        
        tl.insertionAtRight(tl.root,2000);
        tl.insertionAtRight(tl.root, 60);
        preorder(tl.root);
        mt.maximum(tl.root);
        mt.KDistance(tl.root, 3, 0);
        System.out.println();
        
        
    }

}