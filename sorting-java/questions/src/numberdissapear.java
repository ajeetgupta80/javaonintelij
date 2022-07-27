import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// it can only run at leetcode as they are using list interface and yet u dont know it..................
public class numberdissapear {
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,7};
        List<Integer> ans = missing(arr);
        System.out.println(ans);

    }
    static List<Integer> missing(int[] arr)
    {
        int i =0;
        while(i<arr.length)
        {
            int correct = arr.length-1;
            if(arr[i]!= arr[correct])
            {
                swap(arr, i,correct);
            }
            else
            {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index=0; i< arr.length; i++)
        {
            if(arr[index]!=arr[index+1])
            {
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first ,int second)
    {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;

    }
}
