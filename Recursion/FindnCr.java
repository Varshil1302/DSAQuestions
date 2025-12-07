public class FindnCr
{
    public static void main(String[] args)
    {
        System.out.println(nCr(5,1));
        System.out.println(nCr(5,3));
        System.out.println(nCr(7,6));
        System.out.println(nCr(5,0));
    }

    private static int nCr(int n,int r)
    {
        if(r==0||n==r) return 1;
        return nCr(n-1,r-1)+nCr(n-1,r);
    }

}
