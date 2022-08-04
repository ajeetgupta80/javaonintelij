import java.util.Arrays;

public class seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1]; // false means number is primes
        sieve(primes, n);
//        System.out.println(Arrays.toString(primes));

    }
    static void sieve(boolean[] primes, int n)
    {
        for(int i=2; i*i<=n; i++)
        {
            if(!primes[i])
            {
                for(int j =2*i; j<=n; j+=i)
                {
                    primes[j]=true;
                }
            }
        }
        for(int i =0; i<=n; i++)
        {
            if(!primes[i])
            {
                System.out.print(i +" ");
            }
        }

    }
}
