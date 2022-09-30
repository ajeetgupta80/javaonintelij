package doublyLinkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(99);
        list.insertFirst(92);
        list.insertFirst(91);
        list.insertFirst(90);
        list.insertLast(88);
        list.insertFirst(1);
        list.insertLast(30);
        System.out.println(list.size);
        list.display();
        list.insertafter(90,97);
        list.display();
    }
}
