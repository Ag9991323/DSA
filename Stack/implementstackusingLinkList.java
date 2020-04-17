package Stack;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;



class StackNode
{
    int data;
    StackNode next;
    StackNode(int a)
    {
       data = a;
       next = null;
    }
}
class LinkList{
    StackNode head;

    void insertAtBegining(int x){

        StackNode temp = new  StackNode(x);
        temp.next= head;
        head=temp;

    }
    int pop(){
        if(head==null){
            return -1;
        }
        int x =head.data;
        head=head.next;
        return x;
    }
}