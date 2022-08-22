import java.util.ArrayList;

public class pathObstacles {
    public static void main(String[] args) {

        boolean[][] board= {
                {true, true, true},
                {true ,false,true},
                {true ,true ,true}
        };
        path("",board,0,0);
        System.out.println();
        System.out.println(pathONarraylist("",board, 0,0));


    }
    static void path(String p, boolean[][] maze, int row , int col)
    {
        if(row==maze.length-1 && col == maze[0].length-1)
        {
            System.out.print(p+ " ");
            return;
        }

//        this conditoin is for the obstacle
        if(!maze[row][col])
            return;

        if(row<maze.length-1)
        {
            path(p+"D",maze,row+1, col);

        }
        if(col<maze[0].length-1)
        {
            path(p+"R",maze,row, col+1);

        }
    }

//    returning ans in arraylist  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
static ArrayList<String> pathONarraylist(String p, boolean[][] maze, int row , int col)
{
    if(row==maze.length-1 && col == maze[0].length-1)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }
    ArrayList<String> list = new ArrayList<>();
//        this conditoin is for the obstacle
    if(!maze[row][col])
        return list;

    if(row<maze.length-1)
    {
      list.addAll( pathONarraylist(p+"D",maze,row+1, col));

    }
    if(col<maze[0].length-1)
    {
       list.addAll( pathONarraylist(p+"R",maze,row, col+1));

    }
    return list;
}

}
