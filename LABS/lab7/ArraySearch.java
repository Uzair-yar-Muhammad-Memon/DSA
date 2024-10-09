import java.util.Scanner;
import java.util.Random;
public class ArraySearch {
    public static void search(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(n==arr[i]){
                System.out.println(n+" found at index : "+i);
                return;
            }
        }
        System.out.println(n+" not found in array ");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random rd=new Random();
        System.out.print("Enter size of aaray : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(10);
        }
        System.out.print("Enter the number you want to search in array : ");
        int n=sc.nextInt();
        Long StartTime=System.nanoTime();//Time caculate
        search(arr, n);
        Long endTime=System.nanoTime();
        Long TotalTime=endTime-StartTime;
        System.out.print("Total Time : "+TotalTime);//Time caculate
        System.out.println();
        System.out.print("Array is : ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
