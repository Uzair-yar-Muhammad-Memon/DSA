public class StackusingLinkedList {
    private Node head;
    public boolean isEmpty()
    {
        if(head==null){
            return true;
        } 
        return false;
    }
    public void push(int x) // insert at the beginning 
{ 
    Node newNode=new Node(x);
    if(head==null){
        head=newNode;
    }
    else{
        newNode.next=head;
        head=newNode;
    }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            int k=head.data;
            head=head.next;
            return k;
        }
 }
 public int top()
 {
    if(isEmpty()){
        System.out.println("Stack is empty");
        return 0;
    }
    else{
       
        return head.data;
    }
 }

}
