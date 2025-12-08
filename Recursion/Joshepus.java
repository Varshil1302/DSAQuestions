import java.util.HashSet;
import java.util.Set;

public class Joshepus
{
    public static void main(String[] args) {
        System.out.println(Joshepus(6,4));
        System.out.println(Joshepus(5,3));
        System.out.println(Joshepus(3,2));
        System.out.println(isHappy(19));
        System.out.println(isHappy(11));
        System.out.println(isHappy(7));
        System.out.println(isHappy(8));

    }

    public  static int Joshepus(int n,int k)
    {
        if(n==1) return 0;
        else return (Joshepus(n-1,k)+k)%n;
    }
    public static boolean isHappy(int n) {

        int sum=sumSquare(n);
        Set<Integer> set1=new HashSet<>();
       // set1.add(n);
        while(sum!=1 && !set1.contains(sum)){

            set1.add(sum);
            sum=sumSquare(sum);
        }
        return sum==1;
    }
    public static int sumSquare(int n)
    {
        int sum=0;
        while(n>0)
        {
            int k=n%10;
            sum=sum+(k*k);
            n=n/10;
        }
        return sum;
    }
}
