public class PowerModuloIssue
{
    public static void main(String[] args)
    {
        System.out.println(fastPower(7,7,30));
    }
    private static int fastPower(int a,int b,int m)
    {
        if(b==0) return 1;
        if(b<0) return fastPower(1/a,b,m);
        if(b%2!=0){
            return (a%m*fastPower(a,b-1,m)%m)%m;
        }else{
            return fastPower((a%m*a%m)%m,b/2,m);
        }
    }
}
