public class printn {
    public static void main(String[] args) {
        n(5);
        System.out.println();
        nn(5);
    }
    static void n(int n)
    {
        if(n<=0)
        {
            return;
        }
        System.out.println(n);
        n(n-1);
    }
//    for printing 1 to n u need to print when u are emptying the stack call
    static void nn(int n)
    {
        if(n<=0)
            return;

        nn(n-1);
        System.out.println(n);


    }
}
