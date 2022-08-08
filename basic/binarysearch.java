public class binarysearch{

    public static void main(String[] args) {

        int[] arr ={5,6,7,8,9,10};
        int target = 55;
        int ans =ajeet(arr, target);
        System.out.println(ans);

    }
    static int ajeet(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
           int mid = start+(end-start)/2;

           if(arr[mid]<target)
               start = mid +1;

           else if(arr[mid]>target)
           {
               end = mid-1;

           }
           else
           {
               return mid;
           }
        }
        return -1;
    }
}
