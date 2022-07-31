public class Main {
    public static void main(String[] args) {
//        print 1 to n
     print(1);
    }
    static void print(int n)
    {
//        when u call function again again then you can treat it as a seperate call in the stack

        if(n==5)
        {
            System.out.println(5);
            return;
        }
        System.out.println(n);
//        this is call tail recurion because this is the last fucntion call print (n+1)
//        but in the case of fibonacci it not the last its return fib(n-1)+fib(n-2) both are added
//
        print(n+1);
    }
}