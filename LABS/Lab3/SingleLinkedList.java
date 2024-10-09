public class SingleLinkedList {
    public static Node1 head;
    public static Node1 tail;
    public static void AddFront(int data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public static void AddBack(int data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public static void Removefront(){
        if(head==null){
            System.out.println("LinkedList is empty");
        }
        else{
            head=head.next;
        }
    }
    public static void Removelast(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            Node1 temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
    }
    public static void print(){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        else{
            Node1 temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        AddFront(5);
        AddFront(4);
        AddBack(6);
        AddFront(3);
        AddBack(7);
        System.out.print("Original Linked List is : ");
        print();
        System.out.println();
        System.out.print("Linked List after removing from back : ");
        Removelast();
        print();
        System.out.println();
        System.out.print("Linked List after removing from Front and back : ");
        Removefront();
        print();
    }
}
