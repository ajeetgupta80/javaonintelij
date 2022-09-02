package polymorphism;

public class overloading {

   int sum(int a , int b)
    {
        return a+b;
    }
    int sum(int a , int b, int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {

       overloading ajeet = new overloading();
      int aj=   ajeet.sum(5,4);
      int j =   ajeet.sum(8,0,9);
        System.out.println(aj+" "+ j);

    }
}
