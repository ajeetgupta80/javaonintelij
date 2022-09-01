import java.util.ArrayList;
import java.util.List;

public class pascals {
    public static void main(String[] args) {
        List<Integer> ANS = pasc(4);

    }
    static List<List<<Integer>> pasc(int numRows)
    {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row = null;
        List<Integer> pre = null;

        for(int i=0; i<numRows; i++)
        {
            row = new ArrayList<Integer>();
            for(int j =0; j<=i; j++)
            {
                if(j==0 || j==i )
                {
                    row.add(1);
                }
                else
                {
                    row.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre= row;
            res.add(row);


        }
        return res;

    }
}
