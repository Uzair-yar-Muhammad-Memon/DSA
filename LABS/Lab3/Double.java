public class Double {
    public static Node head;
     public static void insertAtBeginning(String name)
  {
     Node newNode=new Node(name);
     if(head==null){
         head=newNode;
     }
     else{
         
         newNode.next=head;
         head.prev=newNode;
         head=newNode;
     }
  }
  public static Node insertAtBeginning(String name,Node head)
  {
     Node newNode=new Node(name);
     if(head==null){
         head=newNode;
         return head;
     }
     else{
         Node temp=head;
         newNode.next=temp;
         temp.prev=newNode;
         head=newNode;
         return head;
     }
  }
  public static void insertAtEnd(String name)
  {
     Node newNode=new Node(name);
     if(head==null){
         head=newNode;
     }
     else{
         Node temp=head;
         while(temp.next!=null){
             temp=temp.next;
         }
         temp.next=newNode;
         newNode.prev=temp;  
     }
 }
     public static Node insertAtEnd(String name,Node head1)
  {
     Node newNode=new Node(name);
     if(head1==null){
         head1=newNode;
     return head1;
 }
 else{
     Node temp=head1;
     while(temp.next!=null){
         temp=temp.next;
     }
     temp.next=newNode;
     newNode.prev=temp;
     return head1;
 }
  }
  public static void Print(Node head){
     if (head==null){
         System.out.println("Linked List is empty");
     }
     else{
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.name+" ");
             temp=temp.next;
         }
     }
  }
  public static void Print(){
     if (head==null){
         System.out.println("Linked List is empty");
     }
     else{
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.name+" ");
             temp=temp.next;
         }
     }
  }
  public static Node insertAfterName(String name, Node head ,String name1)
  {
     Node newNode =new Node(name1);
     int index=1;
     Node temp=head;
     Node temp1=head;
     while(temp1.next!=null){
         if(temp1.name==name){
             break;
         }
         index++;
         temp1=temp1.next;
     }
     if(temp1.next==null&&temp1.name!=name){
         System.out.println("Name not found");
         return head;
     }
     
     for(int i=1;i<index;i++)
     {
         temp=temp.next;
     }
     newNode.next=temp.next;
     temp.next=newNode;
     return head;
 }
 public static Node insertBeforeName(String name, Node head,String name1)
 {
     Node newNode =new Node(name1);
     int index=1;
     Node temp=head;
     Node temp1=head;
     while(temp1.next!=null){
         if(temp1.name==name){
             break;
         }
         index++;
         temp1=temp1.next;
     }
     if(temp1.next==null&&temp1.name!=name){
         System.out.println("Name not found");
         return head;
     }
     
     for(int i=1;i<index-1;i++)
     {
         temp=temp.next;
     }
     newNode.next=temp.next;
     temp.next=newNode;
     return head;
 }
          public static void makeCircular() 
 { 
        Node temp=head;
        Node temp1=head;
        while(temp.next!=null)
        {
           temp=temp.next;
        }
           
            temp1.prev=temp.next;
            temp.next=temp1;
            
            
                for(int i=0; i<10; i++)
                {

                System.out.println(temp.name+" ");
                temp=temp.next;
                }       

 } 
        public static void printAll(Node head1)

 {         System.out.println("Here is linkedlist of with passing head ");
    if (head1==null){
        System.out.println("Linked List is empty");
    }
    else{

          Node temp=head1;
          while(temp!=null){
            System.out.print(temp.name+" ");
            temp=temp.next;
        }
    }
  
       System.out.println();
    System.out.println("Here is circular Linked list ");
    Node temp1=head;
    while(temp1.next!=head)
    {
        System.out.print(temp1.name+" ");
        temp1=temp1.next;
        
    }
    System.out.print(temp1.name);

 } 

  
  public static void main(String[] args) {
     Node head1=null;
     DoubleLinkedList D=new DoubleLinkedList();
     head1=insertAtBeginning("Faraz",head1);
     head1=insertAtBeginning("Ammar", head1);
     head1=insertAtBeginning("GM", head1);
    head1=insertAtEnd("Rehman ALi", head1);
    head1=insertAfterName("Ammar", head1, "Mustafa");
    head1=insertBeforeName("GM", head1, "Mujtaba");
    insertAtBeginning("Rehman");
    insertAtBeginning("Ali");
    insertAtEnd("Mehran");
    printAll(head1);
}
}