public class Main {
//    Given an array nums containing n distinct numbers in the range [0, n] if this is given then do the cyclic sort
    public static void main(String[] args) {
        int[] nums ={3,0,1};
        int ans = misssingnumber(nums);
        System.out.println(ans);

    }
    static int misssingnumber(int[] nums)
    {
        int i =0;
        while(i<nums.length)
        {
            if(nums[i]<nums.length && nums[i]!=nums[nums[i]])
            {
                swap(nums, i, nums[i]);
            }
            else
            {
                i++;
            }
        }
        for(int index=0; index<nums.length; index++)
        {
            if(nums[index]!=index)
                return index;
        }
        return nums.length;
    }
    static void swap(int[] arr, int first ,int second)
    {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;

    }
}