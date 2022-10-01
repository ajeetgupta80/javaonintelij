package Customqueue;

public class maincircularqueue {

    public static void main(String[] args) throws Exception {
        circularqueue que = new circularqueue();
        que.insert(1);
        que.insert(2);
        que.insert(3);
        que.insert(4);
        que.display();

        System.out.println(que.remove());
        System.out.println(que.remove());
        que.display();


    }
}
