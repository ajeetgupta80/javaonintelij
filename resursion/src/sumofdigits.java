public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(digitsum(1234));
        System.out.println();
        System.out.println(prod(55));
    }
//    sum of all the digits
    static int digitsum(int n)
    {
        if(n==0)
            return 0;

        return n%10+digitsum(n/10);
    }

//    product of all the digit
    static int prod(int n)
    {
        if(n==0) // or u can say n%n == n return n
            return 1;

        return n%10*prod(n/10);
    }
}
