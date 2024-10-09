public class QueueusingStack {
    StackusingLinkedList s1;
    StackusingLinkedList s2;
    public void enqueue(int x){
        s1.push(x);
    }
    public int dequeue(){
        while(s1.isEmpty()){
            s2.push(s1.pop());
        }
        int k=s2.pop();
        while(s2.isEmpty()){
            s1.push(s2.pop());
        }
        return k;
    }
    public int peek(){
        return s2.top();
    }
    public static void main(String args[]){
        QueueusingStack q=new QueueusingStack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Front and top element is : "+q.peek());
        System.out.println("Removing : "+q.dequeue());
        System.out.println("Front and top element is : "+q.peek());
        System.out.println("Removing : "+q.dequeue());
        System.out.println("Front and top element is : "+q.peek());
        System.out.println("Removing : "+q.dequeue());
       q. enqueue(4);
        System.out.println("Front and top element is : "+q.peek());
        System.out.println("Removing : "+q.dequeue());
        System.out.println("Front and top element is : "+q.peek());
    }
}

