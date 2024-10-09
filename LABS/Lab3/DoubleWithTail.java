public class DoubleWithTail {
    public static Node head;
    public static Node tail;
    public static void AddFront(String name){
        Node newNode=new Node(name);
        if(head==null){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public static void AddLast(String name){
        Node newNode=new Node(name);
        if(head==null){
            head=tail=newNode;
        }
        else{
          tail.next=newNode;
          newNode.prev=tail;
          tail=newNode;
        }
    }
    public static void RemoveFront(){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    public static void Removelast(){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail.prev=null;
            tail=temp;
        }
    }
    public static void print(){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.name+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        AddFront("Uzair ");
        AddFront("Zubair");
        AddLast("Nawaz");
        AddFront("Jaleel");
        AddLast("Hamza");
        System.out.print("Original Linked List is : ");
        print();
        System.out.println();
        System.out.print("Linked List after removing from back : ");
        Removelast();
        print();
        System.out.println();
        System.out.print("Linked List after removing from Front and last : ");
        RemoveFront();
        print();
    }
}
