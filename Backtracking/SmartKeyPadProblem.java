import java.util.ArrayList;

public class SmartKeyPadProblem
{
    public static void main(String[] args)
    {
       smartkeyIssue("23");
    }
    public static void smartkeyIssue(String str)
    {
        String mat[]={
                "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        ArrayList<String> ans=new ArrayList<>();
        smartkeyIssue(str,mat,0,ans,"");
        System.out.println(ans);

    }

    private static void smartkeyIssue(String str, String[] mat, int index, ArrayList<String> ans, String strings)
    {
        if(index==str.length()){
            ans.add(strings);
            return;
        }
        int numbers=str.charAt(index)-'0';
        String mat1=mat[numbers];
        for(int i=0;i<mat1.length();i++)
        {
            strings=strings+mat1.charAt(i);
            smartkeyIssue(str,mat,index+1,ans,strings);
            strings=strings.substring(0,strings.length()-1);
        }
    }
}
