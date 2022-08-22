import java.util.ArrayList;

public class IncludingALLpaths {
    public static void main(String[] args) {
        boolean[][] board= {
                {true, true, true},
                {true ,true,true},
                {true ,true ,true}
        };
        allpath("",board,0,0);
        System.out.println();
        System.out.println(allpaTh("",board,0,0));

    }

    static void allpath(String p,boolean[][] maze, int row, int col)
    {
        if(row == maze.length-1 && col==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[row][col])
            return;


//        IAM CONSIDERING THIS BLOCK AS MY CURRENT PATH
        maze[row][col]=false;



        if(row<maze.length-1)
        {
            allpath(p+"D",maze,row+1, col);

        }
        if(col<maze[0].length-1)
        {
            allpath(p+"R",maze,row, col+1);
        }
        if(row>0)
        {
            allpath(p+"U",maze,row-1, col);
        }
        if(col>0)
        {
            allpath(p+"L",maze,row, col-1);
        }

//        THIS IS THE LINE WHERE FUNCTION WILL BE OVER
//        SO BEFORE THE FUNCITON GETS REMOVED FROM THE STACK
//        ALSO REMOVE THE CHANGES THAT WERE MADE BY THAT FUNCTION
        maze[row][col]=true;

    }


//    returning in the array list
static ArrayList<String> allpaTh(String p, boolean[][] maze, int row, int col)
{
    if(row == maze.length-1 && col==maze[0].length-1)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }
    ArrayList<String> list = new ArrayList<>();
    if(!maze[row][col])
        return list;


//        IAM CONSIDERING THIS BLOCK AS MY CURRENT PATH
    maze[row][col]=false;



    if(row<maze.length-1)
    {
       list.addAll(allpaTh(p+"D",maze,row+1, col)) ;

    }
    if(col<maze[0].length-1)
    {
      list.addAll(allpaTh(p+"R",maze,row, col+1))  ;
    }
    if(row>0)
    {
       list.addAll(allpaTh(p+"U",maze,row-1, col)) ;
    }
    if(col>0)
    {
       list.addAll(allpaTh(p+"L",maze,row, col-1)) ;
    }

//        THIS IS THE LINE WHERE FUNCTION WILL BE OVER
//        SO BEFORE THE FUNCITON GETS REMOVED FROM THE STACK
//        ALSO REMOVE THE CHANGES THAT WERE MADE BY THAT FUNCTION
    maze[row][col]=true;
    return list;

}
}
