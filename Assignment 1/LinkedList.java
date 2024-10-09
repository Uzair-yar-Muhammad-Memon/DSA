import java.util.Scanner;
public class LinkedList {
    Node head;
    int size=0;
    public void Add(int data){
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
    int nthFromLast(int n){
        if(head==null){
            System.out.println("LinkedList is empty");
            return 0;
        }
        else{
            if(n==0||n>size){
                System.out.println("Index out of bound");
                return -1;
            }
            else{
            Node temp=head;
                while(size!=n) {
              temp=temp.next;
              size--;
                }
                return temp.data;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        int n;
        ll.Add(10);
        ll.Add(20);
        ll.Add(30);
        ll.Add(40);
        ll.Add(50);
        ll.Add(60);
        ll.Add(70);
        ll.Add(80);
        ll.print();
        System.out.println( );
        System.out.print("Enter the number of element to retrive from the last : ");
        n=sc.nextInt();
       System.out.println( ll.nthFromLast(n));
    }
}
