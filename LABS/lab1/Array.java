import java.util.Scanner;
class Array{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[10];
          for(int i=0;i<arr.length;i++){
            System.out.print("Enter element at index "+i+" : ");
            arr[i]=sc.nextInt();
          }
          System.out.println("Array is : ");
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
          }
         for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length-1;j++){
            if(arr[j]%2==0){
                int temp=arr[j];
                arr[j] =arr[j+1];
                arr[j+1]=temp;
            }
        }
         }
         System.out.println();
         System.out.println("Array is : ");
         for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
         }
    }
}