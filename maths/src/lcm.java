public class lcm {
    public static void main(String[] args) {
        System.out.println(lcmm(9,18));

    }
    static int lcmm(int a, int b)
    {
        return (a*b)/gcd(a,b);

    }
    static int gcd(int a, int b)
    {
        if(a==0)
            return b;

        return gcd(b%a, a);
    }
}
