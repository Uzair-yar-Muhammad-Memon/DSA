public class StackClass  {
    Node1 head;
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public void Push(char data){//Add front
        Node1 newNode=new Node1(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public char Pop(){
        if(head==null){
     
           return ' ' ;
        }
        else{
            char k=head.data;
            head=head.next;
            return k;
        }
        
    }
    public  void Top(){
        if(head==null){
      System.out.println("Stack is empty");
        }
        else{
            char k=head.data;
            System.out.println("Poped element is : "+k);
        }
    }
}
