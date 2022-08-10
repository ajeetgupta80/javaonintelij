public class Main {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(powoftwo(n));
    }
    static boolean powoftwo(int n)
    {
        if(n==1 || n ==2)
        {
            return true;
        }
        if(n<1)
        {
            return false;
        }
        if(n%2==0)
        {
            return powoftwo(n/2);
        }
        return false;
    }

}