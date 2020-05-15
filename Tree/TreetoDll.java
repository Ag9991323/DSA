package Tree;
class TreetoDll{
    NodeTree head;
    NodeTree prev=null;
    public void dll(NodeTree root){
        if(root!=null){
            dll(root.left);
            if(prev==null) head =root;
            
        }
     
         
    }
}