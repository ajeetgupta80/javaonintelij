package InterfaceExtends;

public class C implements B {
    public static void main(String[] args) {

        A.greeting();
    }


    @Override
    public void fun() {
        System.out.println("having fun with procrastination");

    }

    @Override
    public void greet() {
        System.out.println("happy fucking day ");
    }



}
