import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergesoort(arr);
        System.out.println(Arrays.toString(arr));// these two statement shows that here original arrays are not modified
        System.out.println();
        arr = mergesoort(arr);
        System.out.println(Arrays.toString(arr));



    }
    static int[] mergesoort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesoort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesoort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] first, int[] second)
    {
        int[] mix = new int[first.length + second.length];
        int i =0;
        int j = 0;
        int k=0;
        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                mix[k]= first[i];
                i++;
            }
            else
            {
                mix[k]= second[j];
                j++;
            }
            k++;
        }

//        it may be possible that the elements on array first or second may be lefted
//        then we should need to add them into mix array

        while(i<first.length)
        {
            mix[k]= first[i];
            i++;
            k++;
        }

        while(j<second.length)
        {
            mix[k]= first[j];
            j++;
            k++;
        }
        return mix;
    }
}
