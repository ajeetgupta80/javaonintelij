import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalarray {
    public static void main(String[] args) {
//        2d array ............
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int row =0; row <arr.length; row++)
        {
            for(int col = 0; col<arr[row].length; col++)
            {
                arr[row][col] = input.nextInt();
            }
        }

        //output
        for(int row =0; row <arr.length; row++)
        {
            for(int col = 0; col<arr[row].length; col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

//        another way to output the 2darray

        for(int row =0; row<arr.length; row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }

//        output usign for each loop
        for(int[] array : arr)
        {
            System.out.println(Arrays.toString(array));
        }

    }
}
