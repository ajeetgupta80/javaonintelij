import java.util.Arrays;

public class variable_args {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9);
        multiple(3,4,"ajeet ", "sandeep");

    }
    static void fun(int ...v) // it can take any numbers
        {
            System.out.println(Arrays.toString(v));
        }
     static void multiple(int a, int b, String ...v)
     {
         System.out.println();

     }
}
