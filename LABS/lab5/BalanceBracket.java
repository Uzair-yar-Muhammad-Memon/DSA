public class BalanceBracket{
    public  void Balanced(String str){
        StackClass stack=new StackClass();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
            stack.Push(str.charAt(i));
            }
        }
    for(int i=0;i<str.length();i++){

             if(str.charAt(i)==')'){
                if(stack.Pop()!='('){
                    System.out.println("Brackets are un balanced");
                    return;
                }
            }
            else if(str.charAt(i)=='}'){
                if(stack.Pop()!='{'){
                    System.out.println("Brackets are un balanced");
                    return;
                }
            }
            else if(str.charAt(i)==']'){
                if(stack.Pop()!='['){
                    System.out.println("Brackets are un balanced");
                    return;
                }
            }
    }
     if(!stack.isEmpty()){
        System.out.println("Brackets are un balanced");
        return;
    }
    System.out.println("Brackets are  balanced");

    }
    public static void main(String[] args) {
        String str="({[]})}";
        BalanceBracket b= new BalanceBracket();
        b.Balanced(str);
    } 
}
