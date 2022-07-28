import java.util.ArrayList;
import java.util.List;
//when questio says like find all the duplicate or missing then first do cyclic sort then run for loop

public class allduplicate {
    public static void main(String[] args) {

    }

        public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
               int correct = nums[i]-1;
               if(nums[i]!=nums[correct])
               {
                   swap(nums, i, correct);
               }
               else
               {
                   i++;

               }

           }
        List<Integer> arr = new ArrayList<>();
        for(int index =0; index<nums.length; i++)
        {
            if(nums[index]!=nums[index+1])
            {
                arr.add(index+1);
            }

        }
        return arr;

    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}
