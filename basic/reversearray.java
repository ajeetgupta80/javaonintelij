import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr= new int[5];
        for(int i=0; i<5; i++)
        {
            arr[i] = input.nextInt();
        }
        reverse(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }

    }
    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            swap(arr, start,end);
            start++;
            end--;

        }
    }
    static void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;

    }

}
