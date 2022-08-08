import java.util.Arrays;

public class method_overloading {
    public static void main(String[] args) {
        fun(80);
        fun("ajeet");
        sum(3,5);
        sum(6,7,8);
        demp(6,7,8,9);
        demp("ajeet", "shivam", "shashwat");


    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String name)
    {
        System.out.println(name);
    }
    static int sum(int a,int b)
    {
        return a+b;
    }
    static int sum(int a,int b,int c)
    {
        return a+b+c;
    }

//    for variable args
    static void demp(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void demp(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
