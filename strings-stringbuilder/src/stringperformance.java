public class stringperformance {
    public static void main(String[] args) {
        String a = "";
        for(int i =0; i<26; i++)
        {
            char ch = (char)('a' + i);
            a = a + ch;
        }
        System.out.println(a);

//        in this program every time a new character added to a a new object is created upto z due to this
//        lots of space is wasted here we introduce a string builder class
//
    }
}
