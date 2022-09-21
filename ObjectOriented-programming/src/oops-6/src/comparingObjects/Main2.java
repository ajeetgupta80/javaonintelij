package comparingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        Students ajeet = new Students(10,50);
        Students abhay = new Students(12,63);
        Students patel = new Students(13,22);
        Students arpit = new Students(14,23);


        Students[] list = {ajeet, abhay , patel, arpit};

        System.out.println(Arrays.toString(list));

        // sort function also require compare to function to compare for the sort
        Arrays.sort(list, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return (int)(o1.marks-o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));
    }

}
