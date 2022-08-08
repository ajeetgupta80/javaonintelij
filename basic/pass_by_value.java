public class pass_by_value {
    public static void main(String[] args) {
//        note in java there is no such thing like pass by referance there is only pass by value
//        a copy of value is pass to the function parameters
        int a =10;
        int b=20;
        swap(a,b);
        System.out.println(a + " " + b);
    }
//    it will not swap because num1 and num2 will not change the actual values because
//    they are provided with a copy of value they can do whatever they want it will not
//            affect the original values
    static void swap(int num1, int num2) {
        int temp = num1;
        num1 =num2;
        num2 = temp;
    }




}
