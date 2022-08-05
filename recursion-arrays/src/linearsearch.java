public class linearsearch {
    public static void main(String[] args) {
        int[] arr ={3,2,1,8,9};
        int key = 9;
        System.out.println(find(arr , key , 0));
        System.out.println();
        System.out.println(findis(arr, key ,0));
        System.out.println();
        System.out.println(findi(arr, key , arr.length-1));

    }
    static boolean find(int[] arr, int key ,int ind)
    {
        if(ind == arr.length)
            return false;

        return arr[ind]==key || find(arr, key , ind+1);
    }
    static int findis(int[] arr, int key ,int ind)
    {
        if(ind == arr.length)
            return -1;

        if(arr[ind]==key)
        {
            return ind;
        }
        else
        {
          return  findis(arr, key, ind+1);
        }

    }

//    if we want to search from back
static int findi(int[] arr, int key ,int ind)
{
    if(ind == arr.length)
        return -1;

    if(arr[ind]==key)
    {
        return ind;
    }
    else
    {
        return  findis(arr, key, ind-1);
    }

}
}
