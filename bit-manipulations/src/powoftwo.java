public class powoftwo {
    public static void main(String[] args) {
        int n =33;
        System.out.println(pow(n));

    }
    static boolean pow(int n)
    {
        boolean ans = (n&(n-1))==0;
        return ans;
    }
}
