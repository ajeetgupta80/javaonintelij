import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
        for(int i=0; i<5; i++)
        {
            list.add(input.nextInt());
        }
        for(int i=0;i<5; i++)
        {
            System.out.println(list.get(i));
        }


        System.out.print(list + " ");
    }
}
