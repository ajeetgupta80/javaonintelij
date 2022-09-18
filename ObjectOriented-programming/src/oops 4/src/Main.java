import access.A;

public class Main {
    public static void main(String[] args) {

//        accessing the data members of class A it is only possible because of public keyword in class A.java
        A obj = new A("ajeet", 99);
        System.out.println(obj.getNum());

    }
}