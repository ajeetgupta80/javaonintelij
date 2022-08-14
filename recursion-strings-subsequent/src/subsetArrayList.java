import java.util.ArrayList;

public class subsetArrayList {
    public static void main(String[] args) {
        System.out.println(sbset("","abc"));

    }
    static ArrayList<String> sbset(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = sbset(p+ch, up.substring(1));
        ArrayList<String> right = sbset(p, up.substring(1));

        left.addAll(right);
        return left;



    }
}
