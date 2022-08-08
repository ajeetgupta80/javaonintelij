import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=0;
        int p=1;
        int count = 2;
        while(count<=n)
        {
            int temp =p;
            p = i+p;
            count++;
            i = temp;
        }
        System.out.println(p);
    }
}
