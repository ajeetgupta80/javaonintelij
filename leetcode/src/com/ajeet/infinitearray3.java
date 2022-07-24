package com.ajeet;

public class infinitearray3 {
    public static void main(String[] args) {
//        assuming that this is the infinite array so we dont have the start and the end
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 5;
        int result = ans(arr, target);
        System.out.println(result);


    }
//    we are going to create two function one for getting start and end inside which the target lies
//    and another function for searching with the given start and end

//    1 for getting start and end
    static int ans(int[] arr, int target)
    {
        int start = arr[0];
        int end = arr[1];
        while(target>arr[end])
        {
            int newstart = end+1;

//            here doubling the array size
            end = end + (end - start +1)*2;
            start = newstart;

        }
       return binarysearch(arr, target,start, end);

    }
    static int binarysearch(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = start+ (end-start)/2;
            if(arr[mid]<target)
            {
                start = mid +1;
            } else if (arr[mid]>target)
            {
                end = mid -1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

}
