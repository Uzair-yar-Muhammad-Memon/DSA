public class CheckCycle {
    public static Node1 head;
    public static Node1 tail;
    public static int size=0;
    public static void Add(int data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=tail=newNode;
            size++;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            size++;
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
    public static void MakeCycle(){
        if(head==null){
            System.out.println(" ");
        }
        else{
            Node1 temp=head;
            Node1 n=null;
            while(temp.next!=null){
                n=temp;
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public static void CheckCycle(){
        Node1 temp=head;
       Node1 n=null;
       int i;
       for( i=1;i<size-1;i++){
        n=temp;
        temp=temp.next;
        if(n.next==temp.next.next){
            System.out.println("Cycle exists");
            break;
        }
       }if(i==size-1){
       System.out.println("Cycle does not exist");
       }
    }
    public static void main(String[] args) {
        Add(5);
        Add(8);
        Add(10);
        Add(15);
        Add(16);
        print();
        System.out.println();
       MakeCycle();
        CheckCycle();
    }
}
