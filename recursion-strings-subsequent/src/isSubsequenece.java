public class isSubsequenece {
    public static void main(String[] args) {
    }
    static boolean is(String s, String t)
    {
        int i =0;
        int j =0;
        while(i<s.length() || j<t.length())
        {
            char ch = s.charAt(i);
            char th = t.charAt(j);
            if(ch == th)
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        if(i==s.length())
        {
            return true;
        }
        else
            return false;
    }
}
