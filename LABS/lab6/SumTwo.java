import java.util.Scanner;
public class SumTwo {
    public static void SortArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int key=arr[i+1];
            for(int j=i;j>=0;j--){
                if(key<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sumtwo(int arr[],int k){ 
         for(int i=0;i<arr.length;i++){
            int left=i;
            int right =arr.length-1;
            while(left<right){
                int mid=(left+right)/2;
                if(arr[i]+arr[mid]==k){
                    System.out.println("Yes "+arr[i]+" + "+arr[mid]+" = "+k);
                    return;
                }
                else if(arr[i]+arr[mid]<k)
                left=mid+1;
                else
                right=mid-1;
            }
         }
         System.out.println("No, there are not any two numbers whosw sum is equal to "+k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter element at index "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a number to find two number whose sum is equal to that number : ");
        int k=sc.nextInt();
        SortArray(arr);
        System.out.println();
        sumtwo(arr, k);
    }
}
