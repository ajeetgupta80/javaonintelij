import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();
        LL list = new LL();
        list.insertFirst(99);
        list.insertFirst(90);
        list.insertFirst(44);
        list.insertFirst(93);
        list.insertFirst(1);
        list.insertLast(599);
        list.insert(4,3);
        System.out.println(list.getSize());
        list.display();



    }


}