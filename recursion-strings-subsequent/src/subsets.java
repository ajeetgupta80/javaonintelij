import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class subsets {
    // it is the pattern of taking some element and removing other element from the list or array

    public static void main(String[] args)
    {
        subset("" , "abc");


    }
    static void subset(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p+ch, up.substring(1));
        subset(p, up.substring(1));
    }

}
