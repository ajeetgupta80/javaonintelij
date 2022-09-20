package abstractdemo;

public class daughter extends parent{

    daughter(int age )
    {
        super(age);  // it is used to call parent class constructor
        this.age = age;
    }

    @Override
    void carrer() {
        System.out.println("iam going to be a pilanthropist");
    }

    @Override
    void partner() {
        System.out.println("nothing");


    }
}
