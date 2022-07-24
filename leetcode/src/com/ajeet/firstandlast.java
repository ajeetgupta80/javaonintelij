package com.ajeet;
//    brute force solution
//    is to iterate increasing and then decreaseing
//    optimised solutino in o(logn)
//    first create search fucntion because we have to check firstindex then lastindex
import java.util.Arrays;

public class firstandlast {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
       int[] result= searchrange(arr, target);
        System.out.println(Arrays.toString(result));



    }
    static int[] searchrange(int[] nums, int target)
    {
        int ans[] = {-1, -1};
        ans[0] = search(nums, target,true);
        ans[1] = search(nums, target, false);
        return ans;



    }
    static int search(int[] nums, int target , boolean findfirstindex)
    {
        int ans = -1;
        int start =0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid]>target)
            {
                end = mid -1;
            }
            else if(nums[mid]<target)
            {
                start = mid+1;
            }
            else{
                ans = mid;
                if(findfirstindex)
                {
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;


    }


    }

