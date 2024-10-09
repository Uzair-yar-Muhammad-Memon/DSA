public class RecursionCharacter {
    public static void Forward(int n){
        if((char)(n)>'z'){
            return;
        }
        else{
            System.out.print((char)(n)+" ");
            Forward(n+1);
        }
    }
    public static void Reverse(int n){
        if((char)(n)>'z'){
            return;
        }
        else{
            Reverse(n+1);
            System.out.print((char)(n)+" ");
        }
    }
    public static void main(String[] args) {
        Forward(97);
        System.out.println();
        Reverse(97);//97 is asciivalue of a
    }
}
