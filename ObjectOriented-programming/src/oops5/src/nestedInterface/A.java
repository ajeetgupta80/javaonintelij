package nestedInterface;


public class A {

    // NESTED INTERFACE
    public interface nestedinterface {
        boolean isOdd(int num);
    }
}
class B implements A.nestedinterface{
    @Override
    public boolean isOdd(int num) {
        return (num & 1 )==1;
    }
}
class main{
    public static void main(String[] args) {
        B ajeet = new B();
        System.out.println(ajeet.isOdd(8));
    }
}


