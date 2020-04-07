package LinkList;

public class RemoveduplicateNode {
    void removeDuplicates(Node root)
    {
         Node curr = root;
         while(curr.Next!=null){

            if(curr.data==curr.Next.data){
                curr.Next=curr.Next.Next;
            }
            else{
                curr=curr.Next;
            }
             
         }
         
         
    }

}