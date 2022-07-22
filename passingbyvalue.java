import java.util.Arrays;

public class passingbyvalue {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] array)
    {
        array[0]= 580;
    }
}
