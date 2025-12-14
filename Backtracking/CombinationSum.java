import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum
{
    public static void main(String[] args) {
        int[] arr={8,1,3,7,2,1,5};
        int sum=12;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        combinationTargetSum(arr,sum,0,ans,new ArrayList<>());
        System.out.println(ans);
    }

    private static void combinationTargetSum(int[] arr, int sum, int index, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr)
    {
        if(sum==0){
            ArrayList<Integer> copycurr=new ArrayList<>(curr);
            ans.add(copycurr);
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(sum<arr[i]) return;
            //
            // System.out.println(index);
            curr.add(arr[i]);
            combinationTargetSum(arr,sum-arr[i],i+1,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}
