public class SubStrings
{

    public static void main(String[] args) {
       printSunString("abc");
    }

    public static  void printSunString(String s)
    {
        printSubStringHelper(s,0,"");
    }

    private static void printSubStringHelper(String s, int i, String s1)
    {
        if(i==s.length())
        {
            System.out.println(s1);
            return;
        }
        printSubStringHelper(s,i+1,s1+s.charAt(i));
        printSubStringHelper(s,i+1,s1);
    }

}
