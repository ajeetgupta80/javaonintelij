public class searchstring {
    public static void main(String[] args) {
//        String str = "ajeet";
//        char target = 'j';
//        System.out.println(strigsearch(str , target));
        int[] arr = { 3,4,4,5,6,7,1};
        System.out.println(minvalue(arr));

    }
//    static boolean strigsearch(String str, char ch)
//    {
//        if(str.length()== 0)
//            return false;
//
//        for(int i=0; i<str.length(); i++)
//        {
//            if(ch == str.charAt(i))
//               return true;
//
//        }
//        return false;
//    }

    static int minvalue(int[] arr)
    {
        int ans = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(ans>arr[i])
            {
                ans = arr[i];
            }

        }
        return ans;
    }
}
