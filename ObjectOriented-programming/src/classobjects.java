public class classobjects {

    public static void main(String[] args) {

//        this is the array of student data type
        Student[] student = new Student[5];

        // ajeet as a reference variable is declard but not inititalised
        Student ajeet = new Student();

//      ajeet is initialized here

        ajeet.name = "gupta ji";
        System.out.println(ajeet.name);


    }

    static class Student {
        int roll;
        String name;
        float marks;
    }

}
