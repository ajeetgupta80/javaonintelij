public class count1s {
    public static void main(String[] args) {
        int n = 00000000000000000000001000001011;
       int ans = count1(n);
        System.out.println(ans);
//leetcode numbers of 1 bits

    }
    static int count1(int n)
    {
        int count =0;
        for(int i=0; i<32; i++)
        {
            if((n&1)==1)
                count = count+(n&1);

            n = n>>1;



        }
        return count;
    }

}
