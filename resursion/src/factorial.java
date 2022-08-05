public class factorial {
    public static void main(String[] args) {
        System.out.println(f(5));
        System.out.println();
        System.out.println(sum(5 ));
    }
//    factorial
    static int f(int n)
    {
        if(n<=1)
            return 1;

        return n*f(n-1);
    }
    static int sum(int n)
    {
        if(n<=1)
            return 1;

        return n+sum(n-1);
    }
}
