/*class Node
{
    int data;
    Node left, right;
    
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}*/

class MAximumSumOfNonAdjacet
{
   static  int[] nod(Node root){
        if(root==null) return new int[2];
        int [] arrleft = nod(root.left);
        int [] arrright = nod(root.right);
        boolean des=false;
       
        int sumcurr =root.data+arrleft[1]+arrright[1];
        int sumchild =Math.max(arrleft[0],arrleft[1])+Math.max(arrright[0],arrright[1]);
        int arr[] = new int[2];
        arr[0]=sumcurr;
        arr[1] =sumchild;
    
         return arr;
    }
    static int getMaxSum(Node root)
    {   
         int arr[] = nod(root);
         return Math.max(arr[0],arr[1]);
    }
}
