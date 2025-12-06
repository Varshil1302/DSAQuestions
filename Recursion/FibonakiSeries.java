public class FibonakiSeries
{
    public static void main(String[] args) {
        System.out.println(fibonakiSeries(3));
        System.out.println(fibonakiSeries(4));
        System.out.println(fibonakiSeries(5));
        System.out.println(fibonakiSeries(6));
    }
    private static int fibonakiSeries(int n)
    {
        if(n==0 || n==1) return n;
        else return fibonakiSeries(n-1)+fibonakiSeries(n-2);
    }
}

//0,1,1,2,3,5,8