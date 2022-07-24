package com.ajeet;

public class peakmountain {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,0};
        int ans = peakmountainelement(arr);
        System.out.println(ans);

    }
    static int peakmountainelement(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {

            int mid = start +(end -start)/2;
            if(arr[mid]<arr[mid+1])
            {
//                it means we are in the increasing area
//                in this we know next element is going to be the bigger so we will assign start
//                    pointer to mid +1;
                start = mid +1;
            }
            else {
//                it means we are in the decreasing area
//                in this situation we dont know if previous element is bigger or smaller
//                        thats why we will assign mid value to end
                end = mid;
            }
        }
//        return anything start or end bcoz while loop will termiate when start == end that
//        is both will be pointing toward the same element
        return start;



    }
}
