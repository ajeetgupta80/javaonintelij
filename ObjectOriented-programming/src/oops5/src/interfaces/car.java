package interfaces;

public class car implements brake , engine ,media{
    @Override
    public void start() {
        System.out.println("i fucking start like a normal class");
    }

    @Override
    public void end () {
        System.out.println("i end like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car");
    }
}
