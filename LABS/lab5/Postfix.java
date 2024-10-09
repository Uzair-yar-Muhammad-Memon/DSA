import java.util.Stack;
public class Postfix {
    public static int precedence(char ch){
        if(ch=='+'||ch=='-')
        return 1;
        else if (ch=='/'||ch=='*')
        return 2;
        return -1;
    }
    public static void Postfix(String str){
        Stack4 stack=new Stack4();
        String result=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&& str.charAt(i)<='z'||str.charAt(i)>='A'&& str.charAt(i)<='Z'||str.charAt(i)>=0&& str.charAt(i)<=9){
                result=result+str.charAt(i);
            }
            else if((str.charAt(i) == '+') || (str.charAt(i) == '-') || (str.charAt(i) == '*') || (str.charAt(i) == '/')){
          if(stack.top == null){
               stack.push(str.charAt(i));
           }
           else{
                                    
          while(precedence(stack.peek()) >= precedence(str.charAt(i))){
        result = result + stack.pop();
                 }
                stack.push(str.charAt(i));
               }
            } 

        }
        while(stack.top!=null){
            result=result+stack.pop();
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str="A+*/BC+C-";
        Postfix(str);
    }
}
