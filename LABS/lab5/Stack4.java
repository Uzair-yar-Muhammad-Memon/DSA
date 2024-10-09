public class Stack4 {
    Node2 top;

    char peek(){
            if(top != null)
        {
                 return top.data;
             }
             else
             return ' ';
         }
         void push(char data){
             Node2 newNode = new Node2(data);
    
             newNode.next = top;
             top = newNode; 
         }
    
         char pop(){
             if(top != null){
                 char TopData = top.data;
                 top = top.next;
                 return TopData;
             }
         else{
           return ' ';
           }
         }
}
