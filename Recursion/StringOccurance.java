public class StringOccurance
{
    public static void main(String[] args) {

        String source="abcabadacavabds";
        String target="ab";
        //System.out.println(source.substring(0,target.length()));
        System.out.println(StringOccurance(source,target));

    }
    private static int StringOccurance(String s,String t){
        return StringOccuranceHelper(s,t,0);
    }

    private static int StringOccuranceHelper(String s, String t, int i) {
        if(i>s.length()-t.length()) return 0;

        int result=StringOccuranceHelper(s,t,i+1);

        boolean isFirstMatch=s.substring(i,i+t.length()).equals(t);

        if(isFirstMatch) return result+1;
        else return result;
    }
}
