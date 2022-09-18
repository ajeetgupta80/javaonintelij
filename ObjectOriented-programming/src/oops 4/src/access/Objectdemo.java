package access;
// class Object is the starting class
// we will discuss about some of its methods

public class Objectdemo {

    int num;
    Objectdemo(int num)
    {
        this.num=num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Objectdemo() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

        public static void main(String[] args) {
//        subclass obj = new subclass("ajeet", 99);
//        System.out.println(obj.getClass());  // it is used to get details of the class
//        System.out.println(obj instanceof subclass);  // it is used to check the object of the class
//        System.out.println(obj.getClass().getName());

            Objectdemo aj = new Objectdemo(99);
            Objectdemo sj = new Objectdemo(99);
            System.out.println(sj.hashCode());
            System.out.println(aj.hashCode());

    }
}
