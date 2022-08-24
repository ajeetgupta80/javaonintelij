import javax.swing.text.html.ListView;

public class NKnights {
    public static void main(String[] args) {
        int n =4;
        boolean[][] boards = new boolean[n][n];
        knight(boards , 0,0,4);

    }
    static void knight(boolean[][] boards, int row , int col, int night)
    {
        if (night == 0)
        {
            display(boards);
            System.out.println();
            return;
        }

//        out of bond condition
        if(row == boards.length-1 && col ==boards.length)
        {
            return;
        }





//        if you reach at the end(col) then try out for the next line(row)
        if(col == boards.length)
        {
            knight(boards, row +1,0,night);
            return;
        }

        if(isSafe(boards, row ,col))
        {
            boards[row][col]= true;
            knight(boards,row,col+1,night-1);
            boards[row][col] = false;
        }

//        and if it is not safe then move ahead also in the end col is going to be out of bond
        knight(boards,row,col+1,night);



    }

//    checking the things we provided is out of bond or not
//    do not repeat yourself hence created this funciton
    static boolean IsValid(boolean[][] boards, int row , int col)
    {
        if(row>=0 && row<boards.length  && col>=0 && col<boards.length )
            return true;
        else
            return false;
    }


    static boolean isSafe(boolean[][] boards , int row , int col)
    {
        if(IsValid(boards,row-2,col-1))
        {
            if(boards[row-2][col-1])
                return false;
        }

        if(IsValid(boards,row-2,col+1))
        {
            if(boards[row-2][col+1])
                return false;
        }

        if(IsValid(boards,row-1,col+2))
        {
            if(boards[row-1][col+2])
                return false;
        }

        if(IsValid(boards,row-1,col-2))
        {
            if(boards[row-1][col-2])
                return false;
        }

        return true;

    }

    static void display(boolean[][] boards)
    {
        for(boolean[] row:boards)
        {
            for(boolean element: row)
            {
                if(element)
                {
                    System.out.print("K ");
                }
                else
                {
                    System.out.print("- ");
                }
            }
            System.out.println();

        }
    }



    }

