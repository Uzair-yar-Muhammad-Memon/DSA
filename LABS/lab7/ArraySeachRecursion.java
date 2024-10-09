import java.util.Random;
import java.util.Scanner;
public class ArraySeachRecursion {
    public static void search(int arr[],int n,int index){
        if(index<arr.length){
        if(arr[index]==n){
            System.out.println(n+" found at index : "+index);
            return;
        }
        else{
            search(arr, n, index+1);
        }
    }
    if(index==arr.length)
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
        System.out.print("Array is : ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        System.out.print("Enter the number you want to search in array : ");
        int n=sc.nextInt();
        Long StartTime=System.nanoTime();
        search(arr, n,0);
        Long endTime=System.nanoTime();
        Long TotalTime=endTime-StartTime;
        System.out.println("Total Time : "+TotalTime);
    }
}
