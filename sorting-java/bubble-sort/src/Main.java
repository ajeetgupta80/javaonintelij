import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr)
    {
        boolean swapped;
        for(int i = 0; i< arr.length-1; i++)
        {
            swapped = false;
            for(int j =1; j< arr.length-i; j++)
            {
//                swap if item is smaller than the previous one
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }


    }
}