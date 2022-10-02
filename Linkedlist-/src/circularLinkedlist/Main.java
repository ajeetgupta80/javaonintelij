package circularLinkedlist;

public class Main {
    public static void main(String[] args) {
       LL list = new LL();
       list.insert(1);
       list.insert(2);
       list.insert(3);
       list.insert(4);
       list.insert(5);
        System.out.println(list.getSize());
        list.delete(3);
       list.display();

    }
}
