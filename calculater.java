import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result =0;

        while(true) {
            System.out.println("enter the operater: ");
            char ch = input.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (ch == '+')
                {
                    result = num1+num2;
                }
                if (ch == '-')
                {
                    result = num1-num2;
                }
                if (ch == '*')
                {
                    result = num1*num2;
                }
                if (ch == '/')
                {
                    if(num2!=0) {
                        result = num1/num2;
                    }
                }
                if (ch == '%')
                {
                    result = num1%num2;
                }
            }
            else if (ch == 'X' || ch == 'x') {
                break;

            }
            else
                System.out.println("invalid operator !");
            System.out.println(result);
        }
        System.out.println(result);
    }
}
