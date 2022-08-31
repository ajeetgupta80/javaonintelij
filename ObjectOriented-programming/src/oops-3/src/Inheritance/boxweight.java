package Inheritance;

public class boxweight extends box{
     double weight;

    boxweight()
    {
        this.weight = 0;
    }
    boxweight(double l , double h, double w, double weight)
    {
        super(l,h,w);  // use to call the parent call constructor
        this.weight = weight;

    }
}
