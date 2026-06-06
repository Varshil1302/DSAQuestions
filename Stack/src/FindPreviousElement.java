import java.util.Arrays;
import java.util.Stack;

public class FindPreviousElement {

    public static void main(String[] args) {
        int[] arr = {1,6,4,10,2,5};
        int[] op=new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.empty() && arr[stack.peek()]>=arr[i])
            {
                stack.pop();
            }
            op[i]=stack.empty()?-1:stack.peek();
            stack.push(i);
        }
        System.out.println(Arrays.toString(op));
    }

}
