import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        System.out.println("hello world");
        int[] arr = {5,4,3,2,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicsort(int[] arr)
    {
        int i =0;
        while( i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr, i,correct);
            }
            else
            {
                i++;
            }
        }
    }
    static void swap(int[] arr , int i , int correct)
    {
        int temp = arr[i];
        arr[i]= arr[correct];
        arr[correct]= temp;
    }


}
