import java.util.Scanner;
class DecimalTobinary{
    public static void binary(int n){
        if(n==1){
         System.out.print("1");
        }
        else{
           binary(n/2);
            System.out.print(n%2);
        }
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal number you want to convert in binary : ");
        int n=sc.nextInt();
        System.out.print("Binary of "+n+" is : ");
        binary(n);

    }
}