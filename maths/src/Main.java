public class Main {
    public static void main(String[] args) {
       int[] arr = {1,2,2,3,3};
       int ans = removeDuplicates(arr);
        System.out.println(ans);

    }
    static int removeDuplicates(int[] nums)
    {
        int i =0;
        for(int j=1; j<nums.length; j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}