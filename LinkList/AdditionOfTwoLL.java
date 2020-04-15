package LinkList;

public class AdditionOfTwoLL {
    public Node Addition(Node head1,Node head2){
     Node temp1= head1;
     Node temp2= head2;
     if(temp1==null){
         return temp2;
     }
     if(temp2==null) return temp1;
     Node n=null;
  
     
     int carry=0;
     boolean one =false;
     boolean  two = false;
     while(temp1!=null||temp2!=null&&(!(one&&two))){
        
         
         int num1=0;
         int num2= 0;
         if(one != true){
          num1= temp1.data;
         }
         if(two != true){
             num2=temp2.data;
         }
         int sum= num1+num2+carry;
         if(sum>9) carry=1;
         else carry=0;
         if(n==null) {
             n=new Node(sum%10);
             head1=n;
         }
         else {
             n.Next = new Node(sum%10);
             n = n.Next;
         }
         if(!one&& temp1.Next==null){
            one = true;
         }
         if(!one)temp1= temp1.Next;
         else temp1=null;
         
         
        if( !two &&temp2.Next==null) two = true;
        if(!two) temp2= temp2.Next;
        else temp2=null;
        
       
     }
     
     return head1;

    }

}