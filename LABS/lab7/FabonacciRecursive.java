public class FabonacciRecursive {
    public static int FabonacciSeries(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return FabonacciSeries(n-1)+FabonacciSeries(n-2);
        }
    }
    public static void main(String[] args) {
        long StartTime=System.nanoTime();
        System.out.println(FabonacciSeries(5));
        long endTime=System.nanoTime();
        long TotalTime=endTime-StartTime;
        System.out.println("Total Time : "+TotalTime);
    }
}
