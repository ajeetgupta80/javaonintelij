public class SudokuSolver {
    public static void main(String[] args) {

        int[][] grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        if(solve(grid))
        {
            display(grid);
        }
        else
        {
            System.out.println("sudoku cannot be solve ");
        }

    }


    static boolean solve(int[][] board)
    {
        int n = board.length;
        int row = -1;
        int col = -1;


        boolean emptyleft = true;

        // this how we are replacing r, c from argument
        for(int i =0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(board[i][j]==0)   // we found an empty intem
                {
                    row = i;
                    col = j;
                    emptyleft = false;
                    break;

                }
            }
//            if you find some empty element in row then just break it
            if(!emptyleft)
            {
                break;

            }
        }

        if(emptyleft)
        {
            return true;   // sudoku is solved
        }


//        now its time to BACKTRACK
        for(int num=1; num<=9; num++)
        {
            if(isSafe(board,row,col,num))
            {
                board[row][col]= num;  // BUT THIS CAN BE FALSE SO CHECK SUDOKU IS SOLVED OR NOT
                if(solve(board))
                {
                    return true;   // found the answer
                }
                else
                {
//                    BACKTRACK...........................
                    board[row][col]= 0;

                }
            }
        }


        return false;  // sudoku cannot be solved
    }



    static boolean isSafe(int[][] board, int row , int col , int num )
    {
//        check the row if that number already exists
        for(int i =0; i<board.length; i++)
        {
            if(board[row][i]==num)
            {
                return false; // you cant add that number here it already exists
            }
        }


//        check the col if that number already exists
        for(int[] nums: board)
        {
            if(nums[col]==num)
            {
                return false;  // you cant add that number here it already exists
            }
        }

//        checknig the square matrix
        int sqrt = (int)(Math.sqrt(board.length));
        int rowstart = row - row % sqrt;
        int colstart = col-col%sqrt;
        for(int r= rowstart; r<rowstart + sqrt; r++)
        {
            for(int c= colstart; c<colstart+sqrt; c++)
            {
                if(board[r][c]== num)
                {
                    return false;
                }
            }
        }

        return true;

    }

    static void display(int[][] board)
    {
        for(int[] row: board)
        {
            for(int col:row)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
