public class PalindromString
{
    public static void main(String[] args) {
        String s1="madam";
        String s2="racecar";
        String s3="Java";
        System.out.println(isPalindrom(s1,0,s1.length()-1));
        System.out.println(isPalindrom(s2,0,s2.length()-1));
        System.out.println(isPalindrom(s3,0,s3.length()-1));

    }

    private static boolean isPalindrom(String s,int l,int r)
    {
        if(l>=r) return true;
        if(s.charAt(l)==s.charAt(r)) return isPalindrom(s,l+1,r-1);
        return false;
    }
}
