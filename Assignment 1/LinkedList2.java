public class LinkedList2 {
    public static  Node head;
  public static int size=0;
    public static  void Add(int data){
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
    public static  Node Add(int data,Node head){
        Node newNode=new Node(data);
        if(head==null){
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
    public static void sort(){
        if(head==null){
            System.out.println("LinkedList is empty");
        }
        else{
        int arr[]=new int[size];
        Node temp=head;
        for(int i=0;i<arr.length;i++){
            arr[i]=temp.data;
            temp=temp.next;
        }
        for(int j=0;j<size;j++){
            for(int k=0;k<size-1;k++){
                if(arr[k]>arr[k+1]){
                    int temp1=arr[k];
                    arr[k]=arr[k+1]; 
                    arr[k+1]=temp1;
                }
                
            }        
        }
        Node n=head;
        for(int l=0;l<size;l++){
            
                n.data=arr[l];
                n=n.next;
        }  
    
        Node m=head;
        while(m!=null){
            System.out.print(m.data+" ");
            m=m.next;
        }
    }
}
    public static void main(String[] args) {
        
        Add(5);
        Add(2);
        Add(6);
        Add(4);
        Add(8);
        Add(1);
        Add(0);
        Add(3);
        print();
        System.out.println();
        sort();
}
}
