public class Fibonacci {
    public static void FibonacciSeries(int n){
        int term1=0;
        int term2=1;
        System.out.print(term1+" ");
        System.out.print(term2+" ");
        for(int i=0;i<n;i++){
            int nextTerm=term1+term2;
            if(nextTerm<=n){
            System.out.print(nextTerm+" ");
            term1=term2;
            term2=nextTerm;}
        }
    }
    public static void main(String[] args) {
        Long StartTime=System.nanoTime();
        FibonacciSeries(60);
        System.out.println();
        Long endTime=System.nanoTime();
        Long TotalTime=endTime-StartTime;
        System.out.println("Total Time : "+TotalTime);
    }
}
