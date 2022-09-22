import java.util.Collection;

public class Enum {
    enum Week
    {
        monday, tuesday , saturday, sunday
        // these are the enum constant
        // these are public static and final
        // as these are final so they cant be inherited
    }

    public static void main(String[] args) {

        Week din;
        din = Week.monday;

        for(Week day: Week.values())
        {
            System.out.println(day);
        }

    }
}
