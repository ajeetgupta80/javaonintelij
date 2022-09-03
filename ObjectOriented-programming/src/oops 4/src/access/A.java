package access;

public class A {
    private int num;  // private means u can only access it inside this class
    String name;
    int[] arr;

    int getNum()   // this is used for getting private num
    {
        return num;
    }

    void setNum(int num)  // usd for setting the value 
    {
        this.num= num;
    }

    A(String name, int num)
    {
        this.num = num;
        this.name = name;
        this.arr = new int[88];

    }

}
