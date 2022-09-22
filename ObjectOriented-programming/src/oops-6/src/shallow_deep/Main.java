package shallow_deep;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ajeet = new Human(88, "ajeet gupta");

        Human twin = (Human) ajeet.clone();
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[2]=100;
        System.out.println(Arrays.toString(twin.arr));

//        here ajeet object arr also changed its value to 100
//        because shallow copy create copy of primitve member but not for non primitive
//        for non-primitive like array or string it just point to the same value
//        to avoid this we use {deep copy}

        System.out.println(Arrays.toString(ajeet.arr));
    }
}
