import java.security.spec.RSAOtherPrimeInfo;

public class arithmetictriplet {
    public static void main(String[] args) {
        int[] nums= {0,1,4,6,7,10};
        int diff = 3;
        System.out.println(arithmeticTriplets(nums, diff));

    }
   static int arithmeticTriplets(int[] nums, int diff)
   {
       int ans =0;
       for(int i=0; i<nums.length; i++)
       {
           for(int j=i+1; j<nums.length; j++)
           {
               if(nums[j]-nums[i]==diff)
               {
                   for(int k=j+1; k<nums.length; k++)
                   {
                       if(nums[k]-nums[j]==diff)
                       {
                           ans++;
                       }
                   }
               }
           }
       }
       return ans;

   }
}
