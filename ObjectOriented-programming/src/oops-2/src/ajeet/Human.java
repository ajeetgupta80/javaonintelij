package ajeet;

public class Human {
    public int age;
    public String name;
    int salary;
    boolean married;

//    the property that are not related to the one object but is common for all the objects of class  we
//    declare them as STATIC
    public static long population;




    public Human(int age , String name, int salary, boolean married)
    {
      this.age= age;
      this.name = name;
      this.salary = salary;
      this.married = married;
      Human.population+=1;
    }
}
