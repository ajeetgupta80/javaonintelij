import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
//      sum();
//      greet();
        String message = greet1();
        System.out.println(greet1());
        int n =sum2();
        System.out.println("the sum2 is " +n);
    }
    static void sum()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num 1");
        int num1 = input.nextInt();
        System.out.println("enter num 2");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("the sum is = "+ sum);

    }
    static void greet()
    {
        System.out.println("have a productive morning");
    }

//    with return value ...........
    static int sum2()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num 1");
        int num1 = input.nextInt();
        System.out.println("enter num 2");
        int num2 = input.nextInt();
        int sum = num1+num2;
        return sum;
    }
    static String greet1()
    {
        String greeting = "how are you my boy";
        return greeting;
    }
}
