import java.util.Scanner;

public class question
{
    public static void main(String[] args) {

        {
//        alphabet case check
            Scanner input = new Scanner(System.in);
            char ch = input.next().trim().charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println("its a Lowercase letter");
            } else {
                System.out.println("its a uppercase letter");
            }
        }

    }

}
