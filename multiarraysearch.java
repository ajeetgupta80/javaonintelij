import java.util.Arrays;

public class multiarraysearch {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9, 10}
        } ;
        int ans = max2d(arr);
        System.out.println(ans);
//        int target = 10;
//        int[] ans = search(arr, target);
//        System.out.println(Arrays.toString(ans));
    }
//    static int[] search(int[][] arr, int target){
//        for(int i=0; i< arr.length; i++)
//        {
//            for(int j=0; j<arr[i].length; j++)
//            {
//                if(arr[i][j]==target)
//                {
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//
//    }

//    finding maximum element in 2d array

    static int max2d(int[][] arr)
    {
        int ans = arr[0][0];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(ans < arr[i][j])
                {
                    ans= arr[i][j];
                }
            }
        }
        return ans;
    }

}

