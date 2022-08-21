import java.util.HashMap;

public class leetcode {
    public static void main(String[] args) {
//        this is not recursion question it is just for practise
        int[] ind = {4,5,6,7,0,2,1,3};
        String ans = shuffle("codeleet",ind);
        System.out.println(ans);

    }
    static String shuffle(String s, int[] ind)
    {
        StringBuilder sb = new StringBuilder(s);
        for(int i =0; i<sb.length(); i++)
        {
            sb.setCharAt(ind[i],s.charAt(i));
        }
        s = sb.toString();
        return s;

    }
}
