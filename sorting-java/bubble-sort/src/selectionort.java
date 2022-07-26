import java.util.Arrays;

public class selectionort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionsrt(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionsrt(int[] arr)
    {
        for(int i=0; i< arr.length; i++)
        {
//            find the max item in the array and swap it with the last element their correct p
            int last = arr.length-i-1;
            int getmax = maxelemnt(arr, 0, last);
            swap(arr,getmax, last);

        }
    }
    static int maxelemnt(int[] arr, int first, int last)
    {
        int max = first;
        for(int i=first; i<=last; i++)
        {
            if(arr[i]>arr[max])
            {
                max = i;
            }
        }
        return max;

    }
    static void swap(int[] arr, int max, int last)
    {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}
