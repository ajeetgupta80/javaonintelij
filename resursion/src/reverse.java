public class reverse {
    public static void main(String[] args) {
        System.out.println(rev(1234));
        System.out.println();
        System.out.println(ispalindrome(1234432));

    }
    static int rev(int n)
    {
        int digits = (int)(Math.log10(n))+1;
        int ans = helper(n, digits);
        return ans;

    }
    static int helper(int n, int digits)
    {
        if(n%10==n)
            return n;

        int rem = n%10;
        return rem* (int)(Math.pow(10,digits-1))+ helper(n/10,digits-1);

    }
    static boolean ispalindrome(int n)
    {
        if(rev(n)==n)
            return true;

        return false;
    }
}
