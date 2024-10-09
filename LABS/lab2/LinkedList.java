public class LinkedList {
    Node head;
    Node tail;
    public boolean  Isempty(){
if(head==null){
    return true;
}
else{
    return false;
}
    }
    public void insert(int data)//add last
    {
        Node newNode=new Node(data);
        if(Isempty()){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }

    }
    public void print(){
        if(Isempty()){
            System.out.println("linked list is empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public void search(int element){
        if(Isempty()){
            System.out.println("linked list is empty");
        }
        else{
            Node temp=head;
            int index=1;
            while(temp!=null){
            if(element==temp.data){
                System.out.println("element "+element+" is found at index : "+index);
                break;
            }
                temp=temp.next;
                index++;
                if(temp==null){
                    System.out.println("element "+element+" is not found");
                }
            }
           
           
        }
       
    }
    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.print();
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);
        ll.insert(10);
        ll.print();
        ll.search(6);
       
    }
}
