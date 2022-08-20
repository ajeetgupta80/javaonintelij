import java.util.ArrayList;
import java.util.List;

public class dicethrow {
    public static void main(String[] args) {

        dice("",2);
        System.out.println();
        System.out.println(dicethro("",2));

    }

//    just simple printing
    static void dice(String p, int target)
    {
        if(target==0)
        {
            System.out.print(p+" ");
            return;
        }

        for(int i=1; i<=6 && i<=target; i++)
        {
            dice(p+i,target-i);
        }
    }

//    returning ans in arraylist
    static ArrayList<String> dicethro(String p, int key)
    {
        if(key==0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i =1; i<=6 && i<=key; i++)
        {
            ans.addAll(dicethro(p+i,key-i));
        }
        return ans;
    }
}
