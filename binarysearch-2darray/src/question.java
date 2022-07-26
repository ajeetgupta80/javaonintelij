public class question {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;

        System.out.println(searchmatrix(matrix , target));

    }
    static boolean searchmatrix(int[][] matrix, int target )
    {
        int row = 0;
        int colm = matrix.length;
        while( row < matrix.length && colm >=0)
        {
            if(matrix[row][colm]==target)
            {
                return true;
            }
            else if(matrix[row][colm]<target)
            {
                row ++;
            }
            else
            {
                colm --;
            }

        }
        return false;

    }
}
