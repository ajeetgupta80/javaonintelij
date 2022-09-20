package interfaces;

public class niceCAR {

    private engine engne;

    public niceCAR()
    {
        engne= new powerengine();
    }
    public niceCAR(engine engne)
    {
    this.engne= engne;
    }

    public void start()
    {
        engne.start();
    }
    public void stop()
    {
        engne.stop();
    }

    public void upgradeengine()
    {
        this.engne = new electricengine();
    }

}
