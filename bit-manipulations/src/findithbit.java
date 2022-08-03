public class findithbit {
    public static void main(String[] args) {
        int n = 182;
        int pos =5;
        int ans = find(n, pos);
        System.out.println(ans);
    }
    static int find(int n, int pos)
    {
        int mask = 1<<pos;
        if((n&mask)==0)
            return 0;
        else
            return 1;
    }
}
