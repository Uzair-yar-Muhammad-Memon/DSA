public class LinkedList3 {
  public static  Node head;
    public  void Add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
           
        }
    }
    public static Node Addfront(int data,Node head){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return head;
        }
        else{
            newNode.next=head;
            head=newNode;
            return head;
        }
    }
    public void print(){
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
    public static void reverse(){
        if( head==null){
              System.out.println("Linked List is empty");
              
        }
        else{
            Node head2=null; 
            Node temp=head;
            while(temp!=null){
               head2=Addfront(temp.data,head2);
               temp=temp.next;
            }
            Node n=head2;
            while(n!=null){
                System.out.print(n.data+" ");
                n=n.next;
            }
        }
    }
 
 public static void main(String[] args) {
        LinkedList3 ll=new LinkedList3();
        ll.Add(10);
        ll.Add(20);
        ll.Add(30);
        ll.Add(40);
        ll.Add(50);
        ll.Add(60);
        ll.Add(70);
        ll.Add(80);
        ll.print();
        System.out.println();
        reverse();     
}}
