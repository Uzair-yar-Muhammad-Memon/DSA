public class LinkedListRecursion {
    public static Node head;
    public static void Addback(int data){
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
    public static void print(Node temp){
        if (temp==null){
            return;
        }
        else{
            System.out.print(temp.data+" ");
            temp=temp.next;
            print(temp);
        }
    }
    public static void main(String[] args) {
        Long StartTime=System.nanoTime();
        Addback(4);
        Long endTime=System.nanoTime();
        Long TotalTime=endTime-StartTime;
        System.out.println("Total Time : "+TotalTime);
        Addback(6);
        Addback(1);
        Addback(3);
        Addback(5);
        print(head);
    }
}
