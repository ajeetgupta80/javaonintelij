public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
    }
    static int gcd(int n, int j)
    {
        if(n==0)
        {
            return j;
        }
        return gcd(j%n, n);
    }
}
