package InterfaceExtends;

public interface A {

    // static method should always have a body the cant be overriden
    static void greeting()
    {
        System.out.println("hey mafuker");
    }
    void fun();
}
