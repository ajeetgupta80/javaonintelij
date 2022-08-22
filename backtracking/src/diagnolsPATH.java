import java.util.ArrayList;

public class diagnolsPATH {
    public static void main(String[] args) {
        System.out.println(path("",3,3));
        System.out.println();
        System.out.println(pathcount(3,3));

    }
    static ArrayList<String> path(String p , int row, int col)
    {
        if(row ==1 && col ==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row>1)
        {
            list.addAll(path(p+"V",row-1, col));

        }
        if(col>1)
        {
            list.addAll(path(p+"H",row, col-1));

        }
        if(row>1 && col>1)
        {
            list.addAll(path(p+"D",row-1, col-1));

        }
        return list;

    }
//    for counting the number of paths it can go through

    static int pathcount(int row, int col)
    {
        if(row ==1 || col ==1)
        {
            return 1;
        }


        int left = pathcount(row-1, col);
        int right = pathcount(row, col-1);
        int diagnol = pathcount(row-1, col-1);

        return left+right+diagnol;

    }
}
