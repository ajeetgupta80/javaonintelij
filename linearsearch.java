import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        int ans = linearsearch(arr , target);
        System.out.println(ans);


    }
    static int linearsearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for(int i=0; i<5; i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;

    }
}
