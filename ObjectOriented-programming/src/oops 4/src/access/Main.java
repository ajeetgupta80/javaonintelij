package access;

public class Main {
    public static void main(String[] args) {

        A obj = new A("ajeet ", 90);
//        System.out.println(obj.num); // num is private u cant access
        System.out.println(obj.getNum());

        obj.setNum(99);
//        after setting num

        System.out.println(obj.getNum());



//    }


    }
}
