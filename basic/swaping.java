import java.util.Arrays;
import java.util.Scanner;

public class swaping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1,2,3,4,78};
        System.out.print(Arrays.toString(arr));
        System.out.println();

        swap(arr, 0,4);
        System.out.print(Arrays.toString(arr));

    }
    static void swap(int[] arr, int index1, int index2)
    {
        int fucktemp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = fucktemp;
    }
}
