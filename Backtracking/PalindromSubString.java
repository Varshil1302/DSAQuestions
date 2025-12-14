import java.util.*;

public class PalindromSubString
{
    public static void main(String[] args)
    {

        String s="abbaca";
        List<List<String>> ans=new ArrayList<>();
        palindromSSHelper(s,0,ans,new ArrayList<String>());
        Set<String> set1=new HashSet<>();
        for(List<String> str:ans){
            for(String ss:str){
                set1.add(ss);
            }
        }
        System.out.println(set1.stream().max(Comparator.comparing(t->t.length())).get());
    }

    private static void palindromSSHelper(String s, int index, List<List<String>> ans, ArrayList<String> curr)
    {
        if(index==s.length())
        {
            List<String> coppy=new ArrayList<>(curr);
            ans.add(coppy);
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrom(s,index,i)){
                curr.add(s.substring(index,i+1));
                palindromSSHelper(s,i+1,ans,curr);
                curr.remove(curr.size()-1);
            }
        }

    }

    private static boolean isPalindrom(String s,int l,int r)
    {
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }



}
