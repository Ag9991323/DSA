 public static void inOrder(Node root)
    {  if(root==null) return ;
       Stack<Node> st = new Stack<>();
       
       Node curr= root;
       while(curr!=null||st.size()>0){
           while(curr!=null) {
               st.push(curr);
               curr= curr.left;
           }
            curr = st.pop();
           System.out.print(curr.data+" ");
           curr= curr.right;
         
         }
    
    }