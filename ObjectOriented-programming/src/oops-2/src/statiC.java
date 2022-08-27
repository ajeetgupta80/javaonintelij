import ajeet.Human;

public class statiC {
    public static void main(String[] args) {

        Human ajeet = new Human(80, "ajeet gupta", 70000,true);
        Human abhay = new Human(80, "abhay patel", 70000,false);

        System.out.println(ajeet.name);
        System.out.println(ajeet.age);

//        this is the use of static == it is used to declare to show the property that are common on objects

        System.out.println(ajeet.population);
        System.out.println(abhay.population);
    }


}
