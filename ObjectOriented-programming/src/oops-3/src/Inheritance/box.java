package Inheritance;

public class box {
    double l;
    double h;
    double w;

    box()
    {
        super(); // its not giving error becose box is derived from a superclass objects
        this.l=0;
        this.w=0;
        this.h=0;
    }

//    cube
    box(double side)
    {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    box(double l, double h, double w)
    {
        this.l=l;
        this.h =h;
        this.w=w;
    }
    box(box old)
    {
        this.l=old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public void information()
    {
        System.out.println("running the box");
    }
}
