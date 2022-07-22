import java.util.Arrays;
import java.util.Scanner;

public class arrayandarraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//  fist we are going to learn about array of primitive

//        int[] arr ; // declaration of array . array is going to store in stack memeory
//        arr = new int[5]; // intialisation of array actually here object is created in the memory(heap)
//
//        for(int i=0; i<arr.length; i++)
//        {
//            arr[i] = input.nextInt();
//        }
//        for(int i=0; i<arr.length; i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//
//        // we can use for each loop to iterate through array
//        for(int j : arr)
//        {
//            System.out.println(j);
//        }
//
//        // antoher way of printing array
//        System.out.println(Arrays.toString(arr));

//        array of non primitives like string;

        String[] str = new String[6];
        for(int i=0; i<str.length; i++ ) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));


    }
}
