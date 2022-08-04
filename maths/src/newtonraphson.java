public class newtonraphson {
    public static void main(String[] args) {
//         it is the newton raphson method of finding squre root
        System.out.println(newton(16));

    }
    static double newton(int n)
    {
        double x=n;
        double root;
        while(true)
        {
            root = 0.5*(x+(n/x));
            if(Math.abs(root-x)<1)// if you want more accurate answer than decrease errro means 0.5 or more
            {
                break;
            }
            x = root;

        }
        return root;
    }
}
