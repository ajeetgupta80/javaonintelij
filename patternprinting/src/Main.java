import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      // patterns
        int n = 5;
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);

    }
   static void pattern1(int n)
   {
       for(int i=1; i<=n; i++)
       {
           for(int j =1; j<=i; j++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
   static void pattern2(int n)
   {
       for(int row = 1; row<=n; row++)
       {
           for(int col = 1; col<=n; col++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
   static void pattern3(int n)
   {
       for(int row = 1; row<=n; row++)
       {
           for(int col = 1; col <= n-row+1; col++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
   static void pattern4(int n)
   {
       for(int row = 1; row <=n; row++)
       {
           for(int col =1; col<=row; col++)
           {
               System.out.print(col+" ");
           }
           System.out.println();
       }
   }
   static void pattern5(int n)
   {
       for(int row=0; row<2*n; row++)
       {
           int col= row >n ? 2*n -row :row;
//           if(row>n)
//           {
//               col = 2*n-row;
//
//           }
//           else{
//               col = row;
//           }
           for(int j =1; j<=col; j++)
           {
               System.out.print("* ");
           }
           System.out.println();

       }

   }
        }

