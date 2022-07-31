public class binaraysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        System.out.println(search(arr, target, 0, arr.length-1));

    }
//    in this we passed int start and end as an argument bcoz when in the future we use search function it wil be our provided start and end

    static int search(int[] arr , int target , int start , int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = start +(end -start)/2;
        if(target==arr[mid])
        {
            return mid;
        }
        if(target<arr[mid])
        {
            return search(arr, target,start,mid-1);
        }
        return search(arr, target, mid+1, end);




    }
}
