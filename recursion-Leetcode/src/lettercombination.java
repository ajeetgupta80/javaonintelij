import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

public class lettercombination {
    public static void main(String[] args) {
//      letter("","12");

        System.out.println(letterr("", "12"));
    }
//    first we wil print the combination and then on next function we will return it on to arraylist
//    static void letter(String p, String up)
//    {
//        if(up.isEmpty())
//        {
//            System.out.println(p);
//            return;
//        }
//
//       int digit = up.charAt(0) -'0';
//        for(int i= (digit-1)*3; i<(digit*3); i++)
//        {
//            char chadd = (char)('a'+i);
//            letter(p+chadd, up.substring(1));
//        }
//
//    }


//    returning it to arraylist in leetcode
    static List<String> letterr(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0)-'0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i=(digit -1)*3; i<(digit*3); i++)
        {
            char chadd = (char)('a'+i);
            ans.addAll(letterr(p+chadd,up.substring(1)));
        }
        return ans;

    }


//    if you want to count the numbers of subset
    static int countt(String p, String up)
    {
        if(up.isEmpty())
            return 1;

        int digit = up.charAt(0)-'0';
        int count =0;
        for(int i=(digit-1)*3; i<digit*3; i++)
        {
            char chadd = (char)('a'+i);
            count = count + countt(p+chadd, up.substring(1));
        }
        return count;
    }

}
