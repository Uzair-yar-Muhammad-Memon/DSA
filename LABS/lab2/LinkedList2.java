public class LinkedList2 {
   Node head;
   Node tail; 
   public boolean  Isempty(){
    if(head==null){
        return true;
    }
    else{
        return false;
    }
        }
        public void insert(int data)//add last
        {
            Node newNode=new Node(data);
            if(Isempty()){
                head=tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
    
        }
        public void print(){
            if(Isempty()){
                System.out.println("linked list is empty");
            }
            else{
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
                System.out.println();
            }
        }
        public void Length(){
            int size=0;
            if(Isempty()){
            System.out.println("Length of linked List is "+size);
            }
            else{
                Node temp=head;
                while(temp!=null){
                    size++;
                    temp=temp.next;
                    if(temp==null){
                        System.out.println("Size of Linked List is "+ size);
                    }
                }
               
            }
        
        }
        public static void main(String[] args) {
            LinkedList2 ll =new LinkedList2();
            ll.Length();
            ll.insert(5);
            ll.insert(6);
            ll.insert(7);
            ll.insert(10);
            ll.print();
            ll.Length();
         
           
        }
    }

