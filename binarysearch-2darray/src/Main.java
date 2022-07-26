import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
//      matrix is sorted in row and coloumn wise manner
//        try to think how u can eliminate row and coloumn
//        {
//            {10,12,13},
//            {11,14,18},
//            {12,15,20}
//        }0
        int[][] matrix = {
                {10,12,13},
                {11,14,18},
                {12,15,20}

        };
        int target = 15;
        System.out.println(Arrays.toString(rowcolmatrix(matrix, target)));


    }
    static int[] rowcolmatrix(int[][] matrix, int target)
    {
        int row =0;
        int column = matrix.length-1;
        while(row < matrix.length && column >=0)
        {
            if(matrix[row][column]==target)
            {
                return new int[]{row, column};
            }
            if(matrix[row][column]>target)
            {
                column --;

            }
            else{
                row ++;
            }
        }
        return new int[]{-1,-1};
    }



}