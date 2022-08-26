public class callingconstructor {
    public static void main(String[] args) {

        Student vicky = new Student();
        vicky.age=20;
        vicky.name = "kushwaha";
        vicky.marks= 99;
        System.out.println(vicky.age);
        System.out.println(vicky.name);
        System.out.println(vicky.marks);

        Student abhay = new Student("abhay pate",80,80);
        System.out.println(abhay.age);
        System.out.println(abhay.name);
        System.out.println(abhay.marks);
        Student ajeet = new Student();
        System.out.println(ajeet.name);
        System.out.println(ajeet.age);


        Student one = new Student();
        Student two = one;

        one.name = "ajeet betichod";
        System.out.println(two.name);


    }
    static class Student{
        int age;
        String name;
        int marks;

        Student()
        {
            this ("ajeet gupta ICPC",68,68);

        }

        Student(String name , int age, int marks)
        {
            this.name = name;
            this.age = age;
            this.marks = marks;

        }



    }
}
