public class shadowing {
    static int x =90; //this will be shadowed in the line 5 after declaration of another x>
    public static void main(String[] args) {
        System.out.println(x);
        int x =40;
        System.out.println(x);
        print();

    }
    static void print()
    {
        System.out.println(x);
    }
}
