public class Joshepus
{
    public static void main(String[] args) {
        System.out.println(Joshepus(6,4));
        System.out.println(Joshepus(5,3));
    }

    public  static int Joshepus(int n,int k)
    {
        if(n==1) return 0;
        else return (Joshepus(n-1,k)+k)%n;
    }
}
