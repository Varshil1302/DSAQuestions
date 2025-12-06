public class SumOfNaturalNumbers
{
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumer(5));
        System.out.println(sumOfNaturalNumer(78));
    }

    private static int sumOfNaturalNumer(int n)
    {
        if(n>1){
            return n+sumOfNaturalNumer(n-1);
        }
        else{
            return 1;
        }
    }
}
