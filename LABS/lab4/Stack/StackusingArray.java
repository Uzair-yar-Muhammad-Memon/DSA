class StackusingArray{
    private int arr[];
   private  int numelement;
   private int size;
   StackusingArray(int size){
    arr=new int[size];
    numelement=0;
    size=0;
   }
   public  Boolean isEmpty(){
    if(numelement==0){
        return true;
    }
    return false;
 }
 public Boolean isFull()
 {
  if(numelement==arr.length){
    return true;
  }
  return false;
 }
 public void push(int x) {
    if(isFull()){
        System.out.println("Stack is full");
    }
    else{
        arr[numelement++]=x;
        size++;
    }
 }
 public int pop()
 {
    if(isEmpty()){
        System.out.println("Stack is empty");
        return -1;
    }
    else{
        size--;
        return arr[--numelement];
    }
 }
 public int top()
 { 
    if(isEmpty()){
        System.out.println("Stack is empty");
        return -1;
    }
    else{
        return arr[numelement-1];
    }
 }
 public int size(){
    return size;
     }
     public static void main (String[] args)
 {
 StackusingArray stack = new StackusingArray(3);
 stack.push(1); // Inserting 1 in the stack 
 stack.push(2); 
 System.out.println("Top element is: " + stack.top());
 System.out.println("Removing : "+stack.pop()); // removing the top 2 
 System.out.println("Removing : "+stack.pop()); // removing the top 1
 stack.push(3);// Inserting 3 in the stack 
 System.out.println("Top element is: " + stack.top()); // Inserting 2 in the stack 
 System.out.println("Stack size is " + stack.size());
 System.out.println("Removing : "+stack.pop());  // removing the top 3 
 System.out.println(stack.pop()); 
 }
}
