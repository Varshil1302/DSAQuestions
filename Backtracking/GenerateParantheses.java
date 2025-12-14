import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses
{
    public static void main(String[] args) {

        ArrayList<String> lst1=new ArrayList<String>();
        paranthisisGenration("",0,4,0,0,lst1);
        System.out.println(lst1);
    }
    public static void paranthisisGenration(String str,int i, int n, int open, int close, ArrayList<String> temp)
    {

           if(i==2*n){
               temp.add(str);
               return;
           }
           if(open<n){
               str=str+'(';
               paranthisisGenration(str,i+1,n,open+1,close,temp);
               str=str.substring(0,str.length()-1);

           }
           if(close<open){
               str=str+')';
               paranthisisGenration(str,i+1,n,open,close+1,temp);
           }

    }
}
