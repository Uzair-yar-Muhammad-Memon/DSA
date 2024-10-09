import java.util.Scanner;
public class MergeSort {
    public static void mergeSort(int arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int L[]=new int[n1];//left array
        int R[]=new int[n2];//right array
        for(int i=0;i<n1;i++){
            L[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=left;
        while(i<n1&&j<n2){
            if(L[i]<R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    public static void Split(int arr[],int left,int right){
        if(left<right){
            int mid=(right+left)/2;
            Split(arr, left, mid);
            Split(arr, mid+1, right);
            mergeSort(arr,left,mid,right);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter element at index "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array : ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        System.out.print("Sorted Array : ");
        Split(arr, 0, arr.length-1);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
