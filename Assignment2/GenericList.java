public class GenericList <T> {
   public  Node <T> head;
   int size=0;
    public boolean isEmpty(){
        return head==null;
    }
    public void AddFront(T data){
        Node <T> newNode=new Node<>(data);
        if(isEmpty()){
            head=newNode;
            size++;
        }
        else{
            newNode.next=head;
            head=newNode;
            size++;
        }
    }
    public void AddBack(T data){
        Node <T> newNode=new Node<>(data);
        if(isEmpty()){
            head=newNode;
            size++;
        }
        else{
            Node<T> temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            size++;
        }
    }
    public void AddMiddle(int index,T data){
        Node<T> newNode=new Node<>(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node<T> temp=head;
            int i=1;
            while(i!=index-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
    public void RemoveFront(){
        if(head==null){
            System.out.println("Generic List is empty");
        }
        else{
            head=head.next;
        }
    }
    public void RemoveBack(){
        if(head==null){
            System.out.println("Generic List is empty");
        }
        else{
            Node<T> temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public void print(){
        if(head==null){
            System.out.println("Generic List is empty");
        }
        else{
            Node<T> temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public void RemoveMidddle(int index){
        if(head==null){
            System.out.println("generic list is empty");
        }
        else{
            int i=1;
            Node<T> temp =head;
            if(index>size){
                System.out.println("Index out of bound");
            }
            while(i!=index-1){
                temp=temp.next;
                i++;
            }
            if(temp.next.next==null){
                temp.next=null;
            }
            else{
            temp.next=temp.next.next;}
        }
    }
    public static void main(String[] args) {
        GenericList<Integer> gl=new GenericList<>();
        gl.AddBack(5);
        gl.AddFront(4);
        gl.AddBack(6);
        gl.AddFront(3);
        gl.AddFront(2);
        gl.AddFront(1);
        gl.AddBack(7);
        gl.AddMiddle(6, 9);
        gl.print();
        System.out.println();
        System.out.print("Removing From Back : ");
       gl.RemoveBack();
        gl.RemoveBack();
        gl.print();
        System.out.println();
        System.out.print("Removing From Front : ");
        gl.RemoveFront();
        gl.RemoveFront(); 
        gl.print();
        System.out.println();
        System.out.print("Removing From Middle : ");
        gl.RemoveMidddle(3);
        gl.print();
    }
}
