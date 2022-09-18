package access;

// WE MADE subclass try to acces the protected member in a subclass

public class subclass extends A{

    public subclass(String name, int num) {
        super(name, num);
    }

    public static void main(String[] args) {
        subclass obj = new subclass("ajeet gupta", 909);
        int j = obj.getNum();

        System.out.println(j);

    }


}
