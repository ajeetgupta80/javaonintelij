import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
//        COMPARISON OF THE STRING ......
//        THERE ARE TWO METHOD OF COMPARIGN STRIGN IN JAVA
//        AND ALSO FOR KNOWIN THAT WHETER TWO STRING POINTING TOWARD THE SAME VALUE OR DIFFERENT
//        String a = "ajeet";
//        String b= "ajeet";
//        System.out.println(a==b);
//        its true bcoz its pointing towards the same object


//        creating different objects of same value.....
//        we are explicitly creating new object of same value
//        in this same objects are going to lie on outside of string pool
//        keep in mind == it compare the object and .equals() compare the value
        String a = new String("ajeet");
        String b = new String("ajeet");
        System.out.println(a==b);
        System.out.println(a.equals(b));

//      you cannot acces to seperate index of the string using a[0] u hava to use a.charat(0)
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));
        System.out.println(a.charAt(4));
        for(int i=0; i<5; i++)
        {
            System.out.print(a.charAt(i) + " ");
        }

    }
}