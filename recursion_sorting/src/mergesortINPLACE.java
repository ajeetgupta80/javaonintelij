public class mergesortINPLACE {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        divide(arr,0,arr.length);

    }
    static void divide(int[] arr, int s, int e)
    {
        if(e-s==1)
            return;

        int mid = s+(e-s)/2;

        divide(arr, s, mid);
        divide(arr, mid, e);

        merge(arr , s , mid, e);

    }
    static void merge(int[] arr, int s,int mid , int e)
    {
        int[] mix = new int[e-s];
        int ind1 = s;
        int ind2 = mid+1;
        int k =0;

        while(ind1<s && ind2<e)
        {

        }

    }
}
