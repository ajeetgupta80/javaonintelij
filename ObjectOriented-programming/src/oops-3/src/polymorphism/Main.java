package polymorphism;

public class Main {
    public static void main(String[] args) {
        shape shape = new shape();
        shape.area();
        square square = new square();
        square.area();
        triangle ajeet = new triangle();
        ajeet.area();
        circle abhay = new circle();
        abhay.area();
        System.out.println("-----------------------");
        shape arpit = new circle();
        arpit.area();

        shape.greeting();
        shape ajay = new circle();
        ajay.greeting();    // you can see static mehtod cannot be overriden but can inherited
    }
}
