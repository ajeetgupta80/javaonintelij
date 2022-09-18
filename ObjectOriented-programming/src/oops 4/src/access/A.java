package access;

//
public class A {
   // private int num;  // private means u can only access it inside this class
    protected int num;
   String name;
    int[] arr;
   public int getNum()   // this is used for getting private num
    {
        return num;
    }

   public void setNum(int num)  // usd for setting the value
    {
        this.num= num;
    }

  public A(String name, int num)
    {
        this.num = num;
        this.name = name;
        this.arr = new int[88];

    }

}
