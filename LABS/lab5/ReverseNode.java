public class ReverseNode{
  public static Node AddBack(Node head,int data){
    Node newNode=new Node(data);
    if (head==null){
        head=newNode;
        return head;
    }
    else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
  }
  public static void print(Node head){
    if(head==null){
        System.out.println("Linked list is empty");
    }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
  }
  public static Node ReverseList(Node head){
        Node prev,curr,next;
        curr=head;
        prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    return prev;
  }
  public static void printReverse(Node head){
    if(head==null){
        System.out.println("Linked list is empty");
    }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
  }
 public static void main(String[] args) {
    Node head=null;
    head=AddBack(head,1);
    head=AddBack(head,2);
    head=AddBack(head,3);
    head=AddBack(head,4);
    head=AddBack(head,5);
    print(head);
    System.out.println();
    Node head1=ReverseList(head);
    printReverse(head1);
    
 }
}