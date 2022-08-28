//    this is the demo to show how to initialize static variables

public class staticINitialization {

    static int a =4;
    static int b ;

//    will only run once when first obj is creted when the class is loaded for the first time
    static {
        System.out.println("i am static block ");
        b= a*5;
    }


    public static void main(String[] args) {

        staticINitialization obj = new staticINitialization();
        System.out.println(obj.a+ " " + obj.b);

        staticINitialization.b+=3;
        System.out.println(obj.a+ " " + obj.b);

//        now this time static block will not run because it has runned for the first time
        staticINitialization object = new staticINitialization();
        System.out.println(object.a+ " "+object.b);

    }
}
