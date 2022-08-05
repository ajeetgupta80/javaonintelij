public class Main {
    public static void main(String[] args) {
//        check if the array is sorted or not using recursion
        int[] arr = {1,2,5,4};
        boolean ans = isSorted(arr,0);
        System.out.println(ans);

    }
    static boolean isSorted(int[] arr , int ind)
    {
        if(ind == arr.length-1)
        {
            return true;
        }
        return arr[ind]<arr[ind+1] && isSorted(arr, ind+1);
    }
}