package Inheritance;

// this for showing single level inheritance

public class boxweight extends box{
     double weight;

    boxweight()
    {
        this.weight = 56565;
    }
    boxweight(double l , double h, double w, double weight)
    {
        super(l,h,w);  // use to call the parent call constructor
        this.weight = weight;

    }


    boxweight(double side, double weight)
    {
        super(side);
        this.weight=weight;
    }
}
