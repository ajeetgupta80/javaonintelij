public class reverseprint {
    public static void main(String[] args) {
        sum(5);
    }
    static void sum(int n)
    {
        if(n<=0)
            return;
        System.out.println(n);
        sum(--n);
//        --n vs n--

    }
}
