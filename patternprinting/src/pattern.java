import java.util.Scanner;
import java.util.regex.PatternSyntaxException;


public class pattern {
    public static void main(String[] args) {

      int n=5;
        pattern(n);
        System.out.println();
        pattern2(n);
//        always remeber when printing numbers in column start row from 1 to n not from 0



    }
    static void pattern(int n)
    {
        for(int row =0; row<2*n; row++)
        {
            int totolcol = row>n?2*n-row: row;
            int spaces = n - totolcol;
            for(int i =0; i<spaces; i++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j<totolcol; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern2(int n)
    {
        for(int row= 1; row<=n; row++)
        {
            for(int spaces =0; spaces<n-row; spaces ++)
            {
                System.out.print("  ");

            }
            for(int col = row; col>=1; col--)
            {
                System.out.print(col+" ");
            }
            for(int col2 = 2; col2<=row; col2++)
            {
                System.out.print(col2+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n)
    {

    }
}
