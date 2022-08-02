public class Main {
    public static void main(String[] args) {

        int n = 25;
        System.out.println(even(n));
    }
    static boolean even(int n)
    {
        if((n&1)==0)
        {
            return true;

        }
        return false;
    }
}