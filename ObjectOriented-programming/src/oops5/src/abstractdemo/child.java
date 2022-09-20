package abstractdemo;
// every child class has to override the method of abstract parent class
// because mehtod in parent does not have any body

public class child extends parent {

    child(int age)
    {
        super(age);
        this.age = age;
    }

    @Override
    void normal()
    {
        super.normal();
    }

    @Override
    void carrer() {
        System.out.println("i am going to be an engineer");
    }

    @Override
    void partner() {
        System.out.println("never trust on love ");

    }
}
