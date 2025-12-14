import java.util.ArrayList;

public class SubSequenceArray
{
    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        subSequenceOfArr(arr,0,ans,new ArrayList<Integer>());
        System.out.println(ans);
    }

    private static void subSequenceOfArr(int[] arr, int index, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr)
    {

            ArrayList<Integer> cpycurr=new ArrayList<>(curr);
            ans.add(cpycurr);

        for(int i=index;i<arr.length;i++){
            curr.add(arr[i]);
            subSequenceOfArr(arr,i+1,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}
