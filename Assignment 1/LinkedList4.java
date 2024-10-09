public class LinkedList4 {
   public static Node head;
    public static int size=0;
    public static void Add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            size++;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            size++;
        }
    }
    public static void print(){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void removeDuplicates(){
            if (head == null) {
                System.out.println("LIST_EMPTY");
                return;
            }
    
            Node temp1 = head;
            while (temp1!= null) {
                Node temp2 = temp1;
                while (temp2.next != null) {
                    if (temp2.next.data == temp1.data) {
                       // duplicate removed
                        temp2.next = temp2.next.next;
                    } else {
                        temp2 = temp2.next;
                    }
                }
                temp1=temp1.next;
            }

         Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;}
    
}
    public static void main(String[] args) {
        
        Add(5);
        Add(4);
        Add(3);
        Add(2);
        Add(1);
        Add(4);
        Add(5);
        Add(2);
        print();
        System.out.println();
        removeDuplicates();
        
}
}
