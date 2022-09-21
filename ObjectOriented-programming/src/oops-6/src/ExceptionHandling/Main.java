package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a =5;
        int b= 0;

        try{
//            int c = a/b;
            divide(a,b);
        }


        // if exception will through it will execute catch
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        // this will always be printid either exception throws or not
        finally {
            System.out.println("this will always execute");
        }

    }
    static int divide(int a, int b) throws ArithmeticException
    {
        // explicitly u can throw something
        if(b==0)
        {
            throw new ArithmeticException("dumbass it cant be divided by zero");
        }
        return a/ b;
    }

}
