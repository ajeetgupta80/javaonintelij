import java.util.Arrays;
import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int[] arr = {2,4,5,8};
        int target = 6;
        int[] result = key(arr, target);
        System.out.println(Arrays.toString(result));

    }
    static int[] key(int[] arr, int target)
    {
        int[] ans = new int[2];
        HashMap<Integer,Integer> aj = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            if(aj.containsKey(target-arr[i]))
            {
                ans[0]=aj.get(target-arr[i]);
                ans[1]= i;
                return ans;
            }
            else
            {
                aj.put(arr[i], i);
            }
        }
        return ans;

    }
}
