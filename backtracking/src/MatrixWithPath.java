import java.util.ArrayList;
import java.util.Arrays;

public class MatrixWithPath {
    public static void main(String[] args) {
        boolean[][] board= {
                {true, true, true},
                {true ,true,true},
                {true ,true ,true}

        };
        int[][] path = new int[board.length][board[0].length];
        paths("",board,0,0,path,1);

    }
    static void paths(String p, boolean[][] mase, int row , int col,int[][] path, int step)
    {
        if(row == mase.length-1 && col==mase[0].length-1)
        {
//            this is for the last step
            path[row][col]=step;
            for(int[] arr: path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!mase[row][col])
            return;


//        IAM CONSIDERING THIS BLOCK AS MY CURRENT PATH
        mase[row][col]=false;

        path[row][col]=step;
        if(row<mase.length-1)
        {
            paths(p+"D",mase,row+1, col,path,step+1);

        }
        if(col<mase[0].length-1)
        {
            paths(p+"R",mase,row, col+1,path,step+1);
        }
        if(row>0)
        {
            paths(p+"U",mase,row-1, col,path,step+1);
        }
        if(col>0)
        {
            paths(p+"L",mase,row, col-1,path,step+1);
        }

//        THIS IS THE LINE WHERE FUNCTION WILL BE OVER
//        SO BEFORE THE FUNCITON GETS REMOVED FROM THE STACK
//        ALSO REMOVE THE CHANGES THAT WERE MADE BY THAT FUNCTION
        mase[row][col]=true;
        path[row][col]=0;


    }
}
