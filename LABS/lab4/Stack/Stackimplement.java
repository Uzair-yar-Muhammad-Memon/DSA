public class Stackimplement {
    public static void main(String[] args) {
        StackusingLinkedList stack=new StackusingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is " + stack.top());
        System.out.println("Removing : "+stack.pop() );
        System.out.println("Removing : "+stack.pop() );
        System.out.println("Removing : "+stack.pop() );
       // System.out.println("Removing : "+stack.pop() );
    }
}
