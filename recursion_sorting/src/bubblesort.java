import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
//        bubble sort recursively
        int[] arr ={5,4,3,2,1};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int r, int c)
    {
        if(r==0)
            return;

        if(c<r)
        {
            if(arr[c]>arr[c+1])
            {
                swap(arr,c, c+1);
            }
            bubble(arr, r,c+1);
        }
        else
        {
            bubble(arr, r-1, 0);
        }

    }
    static void swap(int[] arr, int a , int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
