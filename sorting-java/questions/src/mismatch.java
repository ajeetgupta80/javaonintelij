import java.util.Arrays;

public class mismatch {
    public static void main(String[] args) {
        int[] arr ={1,2,2,4};
        int[] ans = wrong(arr);
        System.out.println(Arrays.toString(ans));


    }
    static int[] wrong(int[] arr)
    {
        int index=0;
        while(index<arr.length)
        {
            int correct = arr[index]-1;
            if(arr[index]!=arr[correct])
            {
                swap(arr, index, correct);
            }
            else
            {
                index++;
            }
        }
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]!= i+1)
            {
                return new int[]{arr[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int arr[], int first, int second)
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }

}
