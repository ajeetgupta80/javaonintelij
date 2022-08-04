import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        int n=40;
        int p=3;
        double ans = sq(n,p);
        System.out.println(ans);



    }
//    brute force solution of finding square root
//    static int sq(int n)
//    {
//        for(int i=1; i<n; i++)
//        {
//            if((i*i)==n)
//                return i;
//        }
//        return -1;
//
//    }

//    optimising by using binary search

    static double sq(int n,int p)
    {
         int s =0;
         int e = n;
        double root =0.0;
         while(s<=e)
         {
             int mid = s+(e-s)/2;
             if(mid*mid==n)
             {
                 return mid;
             }
             else if(mid*mid>n)
             {
                 e = mid -1;
             }
             else
             {
                 s= mid +1;
             }
         }
//         if ans not return then it means it is not perfect square
//        then we will check by incrementing value little by littel
//        like brute force
         double incr = 0.1;
         for(int i=0; i<p; i++)
         {
             while(root*root<=n)
             {
                 root+=incr;

             }
             root-=incr;
             incr/=10;
         }

         return root;
    }
}
