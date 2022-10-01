package Customqueue;

public class mainqueue {
    public static void main(String[] args) throws Exception {
     customqueue que = new customqueue(5);
        que.insert(1);
        que.insert(2);
        que.insert(3);
        que.insert(4);

        System.out.println(que.remove());
        que.display();



    }
}
