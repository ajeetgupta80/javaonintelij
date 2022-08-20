public class kadanealgo {
    public static void main(String[] args) {
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxxi(arr);
        System.out.println(ans);

    }
    static int maxxi(int[] arr)
    {
        int sum=0;
        int maxi=arr[0];

        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
            if(sum>maxi)
                maxi=sum;
            if(sum<0)
                sum =0;
        }
        return maxi;
    }

}
