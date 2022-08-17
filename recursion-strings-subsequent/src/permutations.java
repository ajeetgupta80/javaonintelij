import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
//        permutation("", "12");
        ArrayList<String> res = permu("", "12");
        System.out.println(res);
    }

//    static void permutation(String p, String up)
//    {
//        if(up.isEmpty())
//        {
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//        for(int i=0; i<=p.length(); i++)
//        {
//            String f = p.substring(0,i);
//            String s = p.substring(i,p.length());
//            permutation(f+ch+s, up.substring(1));
//        }
//
//
//    }

    static ArrayList<String> permu(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<=p.length(); i++)
        {
            String F = p.substring(0,i);
            String S = p.substring(i,p.length());
            ans.addAll( permu(F+ch+S, up.substring(1)));
        }
        return ans;

    }
}
