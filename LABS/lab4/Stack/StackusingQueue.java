public class StackusingQueue {
    QueueusingLinkedlist q1;
    QueueusingLinkedlist q2;
    int size;
    public void push(int x){
        q1.enqueue(x); 
        size++;
    }
    public int pop(){
     int i=1;
     while(i!=size){
        q2.enqueue(q1.dequeue());
        i++;
     }
        int k=q1.dequeue();
        size--;
        int j=1;
        while(j<=size){
            q1.enqueue(q2.dequeue());
            j++;
        }
        return k;
    }
   public int top(){
        int k=-1,i=1;
        while(i<=size){
            if(i!=size)
            q2.enqueue(q1.dequeue());
            else{
                k=q1.dequeue();
                q2.enqueue(k);
            }
            i++;
        }
        QueueusingLinkedlist temp=q1;
        q1=q2;
        q2=temp;
        if(k==-1){
            System.out.println("Stack is empty");
        }
        return k;
    }          
    public static void main(String[] args) {
        StackusingQueue stack=new StackusingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is " + stack.top());
        System.out.println("Removing : "+stack.pop() );
        stack.push(4);
        System.out.println("Top element is " + stack.top());
        System.out.println("Removing : "+stack.pop() );
        System.out.println("Top element is " + stack.top());
        System.out.println("Removing : "+stack.pop() );
        System.out.println("Top element is " + stack.top());
        System.out.println("Removing : "+stack.pop() );
        System.out.println("Top element is " + stack.top());
    }
}
