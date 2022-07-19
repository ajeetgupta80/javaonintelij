import java.sql.SQLOutput;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

//        program to convert
        Scanner in = new Scanner(System.in);
        float tempc = in.nextFloat();
        float tempf = (tempc * 9/5) + 32;
        System.out.println(tempf);

    }
}
