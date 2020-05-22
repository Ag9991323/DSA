package Tree;
class LeftView
{
    void leftView(Node root)
    {
      if(root==null) return;
      System.out.print(root.data+" ");
      if(root.left!=null) leftView(root.left);
      else leftView(root.right);
    
}