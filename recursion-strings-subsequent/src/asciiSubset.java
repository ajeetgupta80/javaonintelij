import java.util.ArrayList;

public class asciiSubset {
    public static void main(String[] args) {
//        asci("","abc");
        System.out.println();
        System.out.println(ascii("", "abc"));

    }
//    static void asci(String p, String up)
//    {
//        if(up.isEmpty())
//        {
//            System.out.print(p+" ");
//            return;
//        }
//        char ch = up.charAt(0);
//
//        asci(p,up.substring(1));
//        asci(p+ch,up.substring(1));
//        asci(p+(ch+0),up.substring(1));
//
//    }
//    returning via arraylist
    static ArrayList<String> ascii(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = ascii(p,up.substring(1));
        ArrayList<String> second = ascii(p+ch,up.substring(1));
        ArrayList<String> third  = ascii(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;



    }
}
