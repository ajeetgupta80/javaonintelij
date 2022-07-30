public class stringbuild {
    public static void main(String[] args) {
        StringBuilder aj = new StringBuilder();
        for(int i =0; i<26; i++)
        {
            char ch = (char)('a'+i);
           aj.append(ch);
        }
        aj.deleteCharAt(0);
        aj.reverse();
        System.out.println(aj.toString());
    }
}
