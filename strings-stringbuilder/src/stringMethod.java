import java.util.Arrays;

public class stringMethod {
    public static void main(String[] args) {
       String name = "ajeet gupta";
        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase()); // but it wont change the original name
        System.out.println(name);
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println("     ajeet       ".strip());
    }
}
