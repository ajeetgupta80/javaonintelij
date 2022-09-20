package abstractdemo;
// on child class u have to override these abstract mehtod to make them use

public abstract class parent {


    int age;

    parent(int age)
    {
        this.age = age;
    }

// you cannot create objects of abstract classes bcoz if you can create then these abstract method
    // will not be callable because they dont have body you have to override them

    abstract void carrer();
    abstract void partner();
}
