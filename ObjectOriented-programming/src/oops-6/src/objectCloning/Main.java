package objectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ajeet = new Human(79, "ajeet gupta");
//        Human twin = new Human(ajeet); // for this cloning there is a method in java for cloning

        Human twin = (Human)ajeet.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}
