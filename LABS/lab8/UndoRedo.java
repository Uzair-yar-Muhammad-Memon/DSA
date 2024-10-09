import java.util.Scanner;
import java.util.Stack;
public class UndoRedo {
    Node head;
    public void push(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public  String Pop(){
        if(head==null){
            System.out.println("Stack is empty");
            return " ";
        }
        else{
            String k=head.data;
            head=head.next;
            return k;
        }
    }
    public   void DisplayStack(){
        if(head==null){
            System.out.println("Stack is empty");
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
        Stack<String> s1=new Stack<>();
        System.out.println(s1);
        UndoRedo stack=new UndoRedo();
        UndoRedo stack1=new UndoRedo();
        System.out.println("1. Insert");
        System.out.println("2. Undo");
        System.out.println("3. Redo");
        System.out.println("4. Display Stack");
        System.out.print("Enter your choice : ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        while(choice<=4&&choice>=1){
            if(choice==1){
                System.out.print("Input : ");
                String str=sc.next();
                stack.push(str);
            }
            else if(choice==2){//undo
                if(stack.head==null){
                    System.out.println("Undo Unsuccessful");
                }
                else{
                stack1.push(stack.Pop());
               System.out.println("Undo successfull");
                }
            }
            else if(choice==3){//redo
                if(stack1.head==null){
                    System.out.println("Redo unsuccessfull");
                }
                else{
               stack.push(stack1.Pop());
               System.out.println("Redo Successfull");
                }
            }
            if(choice==4){
                stack.DisplayStack();
                System.out.println();
            }
            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
        }
    }
}
