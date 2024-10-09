import java.util.Scanner;
public class Factorialiterative {
    public static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to find factorial : ");
        int n=sc.nextInt();
        long StartTime=System.nanoTime();
        //System.out.println("Start time : "+StartTime);
        factorial(n);
        Long endTime=System.nanoTime();
        //System.out.println("End Time : "+endTime);
        Long TotalTime=endTime-StartTime;
        System.out.println("ToTal Time : "+TotalTime);

    }
}
