public class skipSTRING {
    public static void main(String[] args) {
        System.out.println(skip("guptaajeetgupta"));
        System.out.println();
        skip2("", "guptaajeetgupta");

    }
    static String skip(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }

        if(up.startsWith("ajeet"))
        {
            return skip(up.substring(5));
        }
        else
        {
            return up.charAt(0) + skip(up.substring(1));
        }
    }
    static void skip2(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        if(up.startsWith("ajeet"))
        {
            skip2("",up.substring(5));
        }
        else
        {
            skip2(p+ up.charAt(0),up.substring(1) );
        }
    }
}
