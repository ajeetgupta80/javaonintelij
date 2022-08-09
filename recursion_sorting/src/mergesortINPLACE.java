import java.util.Arrays;

public class mergesortINPLACE {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
         divide(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

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
        int ind2 = mid;
        int k =0;

        while(ind1<mid && ind2<e)
        {
            if(arr[ind1]<arr[ind2])
            {
                mix[k]= arr[ind1];
                ind1++;
            }
            else
            {
                mix[k]=arr[ind2];
                ind2++;

            }
            k++;

        }

        while(ind1<mid)
        {
            mix[k]= arr[ind1];
            ind1++;
            k++;
        }
        while(ind2<e)
        {
            mix[k]= arr[ind2];
            ind2++;
            k++;
        }

        for(int l=0; l<mix.length; l++)
        {
            arr[s+l]= mix[l];
        }

    }
}
