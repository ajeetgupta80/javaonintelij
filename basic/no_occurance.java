import java.util.Scanner;

public class no_occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count =0;
        while(n >0){
            int lastdigit = n %10;
            if(lastdigit == 3)
            {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}
