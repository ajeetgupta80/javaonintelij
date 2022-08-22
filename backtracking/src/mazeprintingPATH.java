import java.lang.reflect.Array;
import java.util.ArrayList;

public class mazeprintingPATH {
    public static void main(String[] args) {

        path("",3,3);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println(pathreturn("",3,3));
    }
//    in this just printing the path in void
    static void path(String p, int row , int col)
    {
        if(row ==1 && col ==1)
        {
            System.out.print(p+" ");
            return ;
        }

        if(row>1)
        path(p+"d",row-1,col);

        if(col>1 )
        path(p+"r", row,col-1);

    }
//    in this we gonna return paths in arraylist
     static ArrayList<String> pathreturn(String p, int row , int col)
     {
         if(row ==1 && col ==1)
         {
             ArrayList<String> list = new ArrayList<>();
             list.add(p);
             return list;
         }

         ArrayList<String> list = new ArrayList<>();  // this is for the paritcular calls its local list
         if(row>1)
         {
             list.addAll(pathreturn(p+"D", row-1, col));
         }
         if(col>1)
         {
             list.addAll(pathreturn(p+"R", row, col-1));
         }
         return list;
     }
}
