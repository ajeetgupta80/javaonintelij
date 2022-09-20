package abstractdemo;

public class Main {
    public static void main(String[] args) {
        child ajeet = new child(88);
        ajeet.carrer();

        daughter tanisha = new daughter(99);
        tanisha.carrer();

        ajeet.partner();
        tanisha.partner();

//        parent abhay = new parent(45)  // it is not possible to create object of abstrct class
    }
}
