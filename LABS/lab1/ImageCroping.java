import java.util.Scanner;
public class ImageCroping {
    public static void  extractBoundries(int arr[][],int rows,int col)
    {
        System.out.println("extracted Boundries 2D Array is : ");
        for(int i=0;i<rows;i++){
           for(int j=0;j<col;j++){
            if(i==0||j==0||j==col-1||i==rows-1){
               System.out.print(arr[i][j]+" ");
            }
           else{
       System.out.print("  ");
           }
           }
           System.out.println();
        }
    }
    public static void cropCenterPart (int arr[][],int rows,int col)
    {
        System.out.println("Center Part of  2D Array is : ");
        for(int i=0;i<rows;i++){
           for(int j=0;j<col;j++){
            if(i==0||j==0||j==col-1||i==rows-1){
               continue;
            }
           else{
       System.out.print(arr[i][j]+" ");
           }
           }
           System.out.println();
        }
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int rows;
     int col;
     System.err.print("Enter number of rows : ");
     rows=sc.nextInt();
     System.err.print("Enter number of columns : ");
     col=sc.nextInt();
     int arr[][]=new int[rows][col];
     for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            System.out.print("Enter element at index ["+i+"]["+j+"] : ");
            arr[i][j]=sc.nextInt();
        }
     }
     System.out.println("Actual 2D Array is : ");
     for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+" ");
        
        }
        System.out.println();
     }
ImageCroping.extractBoundries(arr,rows,col);
ImageCroping.cropCenterPart(arr, rows, col);

    }
    
}
