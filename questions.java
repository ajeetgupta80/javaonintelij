import java.util.Scanner;

public class questions {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        q1: find the largest of the 3 number
//        int max = a;
//        if(b>max)           1st way
//            max =b;
//        if(c>max)
//            max = c;
//        -----------------------
//        int max =0;
//        if(a>b)
//            max =a;
//        else{             2nd way
//            max =b;
//        }
//        if (c>max)
//        {
//            max=c;
//        }
//     ------------------------
          int max = Math.max(c,Math.max(a,b));


        System.out.println("maximum number is " + max);

    }

}
