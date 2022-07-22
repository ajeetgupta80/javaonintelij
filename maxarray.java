import java.util.Scanner;

public class maxarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("enter the size of array");
        n = input.nextInt();
        System.out.println("enter the array elements");
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = input.nextInt();

        }
        System.out.print("maximum value is ");

        System.out.println(max(arr));

    }
    static int max(int[] arr)
    {
        int maxno=arr[0];
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i]> maxno)
            {
                maxno = arr[i] ;
            }
        }
        return maxno;

    }
}
