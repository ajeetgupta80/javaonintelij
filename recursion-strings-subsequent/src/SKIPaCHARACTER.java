public class SKIPaCHARACTER {
    public static void main(String[] args) {
        skip("", "baccdah");
        System.out.println();
        System.out.println(skip2("baccdah"));

    }

    static void skip(String p, String up) // in this string is taken in argument
    {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }


    }

    static String skip2(String up)// in this method we are creating
    {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }
}
