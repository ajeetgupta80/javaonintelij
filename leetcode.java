public class leetcode {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,44};
        int ans = findnumbers(nums);
        System.out.println(ans);

    }
    static int findnumbers(int[] nums)
    {
        int count =0;
        for(int i=0; i<nums.length; i++)
        {
            if(even(nums[i]))
                count++;

        }
        return count;


    }
    static boolean even(int n)
    {
        int noofdigit = digit2(n);
        if(noofdigit%2==0)
            return true;
        else
            return false;
    }
//    static int digit(int n)
//    {
//        int count =0;
//        while(n>0)
//        {
//            count++;
//            n=n/10;
//        }
//        return count;
//    }

//    optimised way to det digits
    static int digit2(int num)
    {
        if(num<0)
        {
            num = num*-1;
        }
        return (int)(Math.log10(num))+1;

    }

}

