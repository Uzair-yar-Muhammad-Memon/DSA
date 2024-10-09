import java.util.Scanner;
class Recursionascending{
    public static void ascending(int n){
        if(n==0){
            return;
        }
        else{
            
            ascending(n-1);
            System.out.print(n+" ");
        }
    }
    public static void descending(int n){
        if(n==0){
            return;
        }
        else{
            System.out.print(n+" ");
            descending(n-1);
        }
    }
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number: ");
int n=sc.nextInt();
ascending(n);
System.out.println();
descending(n);
    }
}