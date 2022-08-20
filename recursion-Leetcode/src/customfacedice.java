import java.util.ArrayList;

public class customfacedice {
    public static void main(String[] args) {
        face("",4,6);
        System.out.println();
        System.out.println(dice("",4,6));

    }
//    printing just ans
    static void face(String p, int key, int faces)
    {
        if(key == 0)
        {
            System.out.print(p+" ");
            return;
        }
        for(int i=1; i<=faces && i<=key; i++)
        {
            face(p+i, key-i, faces);
        }
    }

//    returning ans in the arraylist
    static ArrayList<String> dice(String p, int key, int faces)
    {
        if(key ==0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1; i<=faces && i<=key; i++)
        {
            ans.addAll(dice(p+i, key-i, faces));
        }
        return ans;
    }
}
