import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to find factorial : ");
        int n=sc.nextInt();
        Long StartTime=System.nanoTime();
       System.out.println( factorial(n));
       Long endTime=System.nanoTime();
       Long TotalTime=endTime-StartTime;
       System.out.println("Total Time : "+TotalTime);
    }
}
