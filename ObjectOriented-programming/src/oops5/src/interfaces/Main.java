package interfaces;

public class Main {
    public static void main(String[] args) {
//        car audi = new car();
//        audi.end();
//        audi.start();
//        audi.stop();
//
//
//        media carMedia = new car();
//        carMedia.start();


        niceCAR car = new niceCAR();
        car.start();
        car.stop();
        car.upgradeengine();
        car.start();
        car.stop();

    }
}
