public class maxwealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        int ans = maxwealth(arr);
        System.out.println(ans);


    }
    static int maxwealth(int[][] arr)
    {
        int max =0;
        for(int i=0; i< arr.length; i++)
        {
            int rowsum=0;
            for(int j=0; j<arr[i].length; j++)
            {
                rowsum+= arr[i][j];
            }
            if(max<rowsum)
            {
                max= rowsum;
            }
        }
        return max;
    }
}
