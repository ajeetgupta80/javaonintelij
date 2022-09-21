package lambdaFunction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<5; i++)
        {
            arr.add(i+1);
        }
//        this can be replace in one line lambda funtion it is like the inline function
//        for (int item:arr) {
//            System.out.println(item*2);
//        }

        // this is something known as lambda funciton
        arr.forEach((item)-> System.out.println(item*2));
        System.out.println("--------------");

        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        arr.forEach(fun);


        operation sum = (a,b)-> a+b;
        operation prod = (a,b) -> a*b;

        Main calcu = new Main();
        System.out.println(calcu.operate(5,4,sum));
        System.out.println(calcu.operate(5,4,prod));




    }
    private int operate(int a, int b,operation op)
    {
        return op.idk(a,b);

    }

}

// here it is like the consumer<integer> interface used to store lambda function
// so we created our own interface operations

interface operation
{
    int idk(int a , int b);


}
