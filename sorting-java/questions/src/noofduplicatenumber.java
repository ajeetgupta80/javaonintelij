import java.util.ArrayList;
import java.util.List;
//this will not work bcoz uses list interfac and yet you havent learned about the interface
//try this on leetcode

public class noofduplicatenumber {
    public static void main(String[] args) {


    }
    static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                swap(nums, i,correct );
            }
            else
            {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index= 1; index<nums.length; index++)
        {
            ans.add(index+1);
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
