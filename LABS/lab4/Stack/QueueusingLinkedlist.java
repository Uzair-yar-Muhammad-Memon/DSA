public class QueueusingLinkedlist {
    private static Node head=null;
    private static Node tail=null;
    public static boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public static void enqueue(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public static int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int k=head.data;
            head=head.next;
            return k;
        }
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            return head.data;
        }
    }
    public static void main(String args[]){
        enqueue(1);
        enqueue(2);
        enqueue(3);
        System.out.println("Front and top element is : "+peek());
        System.out.println("Removing : "+dequeue());
        System.out.println("Front and top element is : "+peek());
        System.out.println("Removing : "+dequeue());
        System.out.println("Front and top element is : "+peek());
        System.out.println("Removing : "+dequeue());
        System.out.println("Removing : "+dequeue());
        enqueue(4);
        System.out.println("Front and top element is : "+peek());
        System.out.println("Removing : "+dequeue());
        System.out.println("Front and top element is : "+peek());
    }
}
