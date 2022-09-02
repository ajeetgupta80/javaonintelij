package polymorphism;

public class objectPrint {

    int num;

    objectPrint(int num)
    {
        this.num= num;
    }

    // if you will remove this then it will give a random hash value
    // also at runtime this function will override to original tostring funciton
    @Override
   public  String toString()
    {
        return "value ="+ num;
    }

    public static void main(String[] args) {
        objectPrint obj = new objectPrint(68);
        System.out.println(obj);
        System.out.println(obj.num);

    }
}
