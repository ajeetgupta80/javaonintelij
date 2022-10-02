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
//        System.out.println(list.getSize());
        list.display();
        System.out.println();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println();
        System.out.println(list.delete(2));
        list.display();
        System.out.println();
        list.insertrec(91, 2);
        list.insertrec(91,2);
//        list.removeDuplicates();
        list.display();





    }


}