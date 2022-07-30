import java.util.Locale;

public class palindrome {
    public static void main(String[] args) {
        String aj ="";
        System.out.println(palindrome(aj));

    }
    static boolean palindrome(String aj)
    {
        if(aj == null || aj.length() == 0)
        {
            return true;
        }
        aj = aj.toLowerCase();
        for(int i=0; i<=aj.length()/2; i++)
        {
            char start = aj.charAt(i);
            char end = aj.charAt(aj.length()-1-i);
            if(start!=end)
            {
                return false;
            }
        }
        return true;

    }
}
