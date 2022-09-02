package Inheritance;

// it is for demonstrating hierarchila inheritance

public class boxcolor extends boxweight{

    String color;
    boxcolor(double side , double weight, String color)
    {
        super(side , weight);
        this.color= color;
    }
}
