class Selectionsort{
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String args[]){
        int arr[]={8,4,9,3,1,0,2,6,5,7};
        SelectionSort(arr);
    }
}