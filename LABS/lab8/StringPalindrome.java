import java.util.Scanner;
public class StringPalindrome {
    public static boolean CheckPalindrome(char arr[],int start,int end){
        if(start==end){
            System.out.println("String is palindrome");
            return true ;
        }
        if(end<start){
            System.out.println("String is palindrome");
            return true ;
        }
       else if(arr[start]!=arr[end]){
            System.out.println("String is not palindrome");
            return false;
        }
        else{
            start++;
            end--;
             return CheckPalindrome(arr, start, end);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter aany String to Check palindrome : ");
        String str=sc.next();
        char arr[]=new char[str.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=str.charAt(i);
        }
     System.out.println(CheckPalindrome(arr, 0, arr.length-1));
    }
}
