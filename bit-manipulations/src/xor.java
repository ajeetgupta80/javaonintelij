public class xor {
    public static void main(String[] args) {
        int[] n = {2,3,3,4,2,6,4};
        System.out.println(ans(n));

    }
    static int ans(int[] arr)
    {
        int unique = 0;
        for(int i: arr)
        {
            unique^= i;

        }
        return unique;
    }
}
