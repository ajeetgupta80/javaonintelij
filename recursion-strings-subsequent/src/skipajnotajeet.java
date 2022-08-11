public class skipajnotajeet {
    public static void main(String[] args) {
        System.out.println(skip("ajajeetgupta"));
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("aj") && !up.startsWith("ajeet")) {
            return skip(up.substring(2));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }
}
