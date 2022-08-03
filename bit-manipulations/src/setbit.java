public class setbit {
    public static void main(String[] args) {
//        set means if element in pos is 0 then make it 1 if it is 1 then make it 1
        int n = 1010110;
        int pos = 4;
        int ans = set(n,pos);
        System.out.println(ans);
    }
    static int set(int n, int pos)
    {
        int mask = 1<<pos-1;
        return (mask|n);
    }
}
