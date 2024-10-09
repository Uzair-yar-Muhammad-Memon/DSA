import java.util.Scanner;
public class CopyArray {
   public static void  noDup(int arr[][],int size){
           int array[]=new int[size];
           int n=0;
           for(int i=0;i<4;i++){
                for(int j=0;j<5;j++){
                    array[n++]=arr[i][j];
                }
           }
           System.out.println("1D Array is : ");
           int m=size;
           for(int i=0;i<size-1;i++){
           for(int j=i+1;j<size;j++){
            if(array[i]==array[j]){
                for(int k=j;k<m-1;k++){
                    array[k]=array[k+1];
                }
              
            j--;
                m--;
            }
            
           }
          
        }
        for (int i = m; i < size; i++) {
            array[i] = 0;
        }
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
   } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]Two_D_array=new int[4][5];
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print("Enter element at index ["+i+"] ["+j+"] : ");
                Two_D_array[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D Array is  ");
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(Two_D_array[i][j]+" ");
                
            }
            System.out.println();
        }
        CopyArray.noDup(Two_D_array, 20);
    }
}
