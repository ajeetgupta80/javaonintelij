import java.util.ArrayList;
import java.util.Arrays;

public class getAllIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        int key = 3;
        linear(arr, key , 0);
        System.out.println(list);
        System.out.println();
        ArrayList<Integer> ans = search(arr, key,0,new ArrayList<>());
        System.out.println(ans);
        System.out.println();
        System.out.println(search(arr, key, 0));

    }
//    in this method you have to create an array list outside the function
    static ArrayList<Integer> list = new ArrayList<>();
    static void linear(int[] arr, int key , int ind )
    {
        if(ind == arr.length)
            return ;

        if(arr[ind]==key)
        {
            list.add(ind);
        }

            linear(arr, key , ind+1);


    }


//    second mehtod in this mehtod we take array list as an argument
    static ArrayList<Integer> search(int[] arr, int key , int ind , ArrayList<Integer> list)
    {
        if(ind == arr.length)
        {
            return list;
        }
        if(arr[ind]== key)
        {
            list.add(ind);
        }
        return search(arr, key ,ind+1, list);

    }

//    VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
//   IN THIS MEHTOD RETURN THE LIST WUTHOUT TAKING AS AN ARGUMENT
static ArrayList<Integer> search(int[] arr, int key , int ind )
{
    ArrayList<Integer> list = new ArrayList<>();
    if(ind == arr.length)
        return list;

    if(arr[ind]==key)
    {
        list.add(ind);
    }
    ArrayList<Integer> ansfrombelowcalls = search(arr, key , ind +1);
    list.addAll(ansfrombelowcalls);
    return list;

}
}
