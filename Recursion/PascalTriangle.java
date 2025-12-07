import java.util.ArrayList;
import java.util.List;

public class PascalTriangle
{
    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> lst=new ArrayList<>();
            for(int j=0;j<=i;j++){
                lst.add(nCr(i,j));
            }
            result.add(lst);
        }
        System.out.println(result);
    }
    private static int nCr(int n,int r)
    {
        if(r==0||n==r) return 1;
        return nCr(n-1,r-1)+nCr(n-1,r);
    }
}
