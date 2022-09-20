package interfaces;

public class powerengine implements engine{
    @Override
    public void start() {
        System.out.println("power engine starts");
    }

    @Override
    public void stop() {
        System.out.println("power engine stops");
    }
}
