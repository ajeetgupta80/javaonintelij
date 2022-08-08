public class agnosticbs {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
//        int[] arr ={9,8,7,6,5,4,3,2,1};
        int target = 7;
        int ans = bs(arr, target);
        System.out.println(ans);
    }
    static int bs(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        boolean ascending = arr[start]<arr[end];


        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]== target)
            {
                return mid;
            }
            if(ascending)
            {
                if(arr[mid]>target)
                {
                    end = mid -1;
                }
                else if(arr[mid]<target){
                    start = mid +1;
                }
            }
            else
            {
                if(arr[mid]<target)
                {
                    end = mid -1;
                }
                else if(arr[mid]>target){
                    start = mid +1;
                }
            }
        }
        return -1;

    }
}
