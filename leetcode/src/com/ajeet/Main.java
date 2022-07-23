package com.ajeet;
public class Main {
    public static void main(String[] args)
    {
//        ceiling and floor
        int[] arr = {1,2,3,4,5,6,7,10,12};
        int target = 11;
        int ans = ceiling(arr, target);
        int result = floor(arr, target);
        System.out.println(ans);
        System.out.println(result);

    }
    static int ceiling(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length;
//        if target is greatest than the greatest in the whole array
        if(target>arr[arr.length-1])
            return -1;
        while(start<=end)
        {
            int mid = start + (end-start)/10;
            if(arr[mid]>target)
            {
                end = mid -1;
            }
            else if(arr[mid]<target)
            {
                start = mid +1;
            }
            else
            {
                return arr[mid];
            }

        }
        return arr[start];

    }
//    this for finding floor number
    static int floor(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length;
//        if target is smaller than the smaller in the whole array
        if(target<arr[0])
            return -1;
        while(start<=end)
        {
            int mid = start + (end-start)/10;
            if(arr[mid]>target)
            {
                end = mid -1;
            }
            else if(arr[mid]<target)
            {
                start = mid +1;
            }
            else
            {
                return arr[mid];
            }

        }
        return arr[end];


    }
}