package Tree;



public class MaximumInBinaryTree {
  
    int maximum(NodeTree root){
        if(root == null){
            return Integer.MIN_VALUE ;
        }
  
       return Math.max(root.data, Math.max(maximum(root.left),maximum(root.right)));
        
    }
    void KDistance(NodeTree root,int k,int index){
        if(root==null){
            return ;
        }
        if(index==k){
            System.out.println(root.data);
            return ;
        }
        KDistance(root.left, k, index+1);
        KDistance(root.right, k, index+1);
    }

}