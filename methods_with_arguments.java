import java.util.Scanner;

public class methods_with_arguments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int n= sum(num1,num2);
        System.out.println("sum is "+n );


        System.out.println("enter your name");
        String name = input.next();
        String print = greet(name);
        System.out.println(print);

    }

//    return type with arguments
    static int sum(int a, int b)
    {
        return a+b;
    }

    static String greet(String name)
    {
        String ajeet = "hello "+name;
        return ajeet;
    }
}
