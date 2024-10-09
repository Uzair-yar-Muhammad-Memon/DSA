public class QueueusingArray {
    private int arr[];
    private int front;
    private int rare;
    private int count;
    QueueusingArray(int size){
        arr=new int[size];
        front=0;
        rare=0;
        count=0;
    }
    public boolean isEmpty(){
        return count<arr.length;
    }
    public void enqueue(int data){
        if(isEmpty()){
            arr[rare]=data;
            rare= (rare+1)%5;
            count++;
        }
        else{
            System.out.println("Queue is full");
        }
    }
    public void dequeue(){
        if(count==0){
            System.out.println("Queue is empty");
        }
        else{
        System.out.println(arr[front]);
        front=(front+1)%5;
        count--; 
        }
    }
    public int peek()
 {
    return arr[front];
 }
 public int size()
 {
    return count;
 }
 public static void main(String[] args) {
    QueueusingArray q=new QueueusingArray(7);
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    System.out.println("Queue size is " + q.size());
    System.out.println(" Front and top element is : "+q.peek());
    System.out.print("Removing : ");
    q.dequeue();
    System.out.println(" Front and top element is : "+q.peek());
    System.out.print("Removing : ");
    q.dequeue();
   System.out.println("Queue size is " + q.size());
    System.out.println(" Front and top element is : "+q.peek());
    System.out.print("Removing : ");
    q.dequeue();
    System.out.println(" Front and top element is : "+q.peek());
    System.out.println("Queue size is " + q.size());
 }
}
