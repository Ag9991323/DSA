
/*
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/

class FixingNodes
{
    void inorder(Node root,ArrayList<Node> ls){
        if(root!=null){
            inorder(root.left,ls);
            ls.add(root);
            inorder(root.right,ls);
            
        }
    }
   
    
    public Node correctBST(Node root)
    {
       if(root==null) return null;
       ArrayList<Node> ls = new ArrayList<Node>();
       inorder(root,ls);
       int istpos=-1;
       int pos2=-1;
       for(int i=0;i<ls.size()-1;i++){
           if(ls.get(i).data>ls.get(i+1).data){
               if(istpos==-1) istpos=i;
               else pos2=i+1;
           }
       }
    
       if(pos2==-1){
           for(int i=istpos-1;i>=0;i--){
               if(ls.get(i).data<ls.get(istpos).data){
                   int temp = istpos;
                   istpos=i;
                   pos2=temp;
               }
           }
       }
        
       int temp =ls.get(istpos).data;
       ls.get(istpos).data= ls.get(pos2).data;
       ls.get(pos2).data= temp;
      
       return root;
       
    }
    
}