package generic;

import java.util.Arrays;
import java.util.List;

public class wildcards<T extends Number>  {
    private  Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public wildcards()
    {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getlist(List< ? extends Number> list)
    {
//        here now you can also pass integer float double

    }

    public void add(T num)
    {
        if(isFull())
        {
            resize();
        }
        data[size++]= num;
    }


    private boolean isFull()
    {
        return size == data.length;
    }

    private void resize()
    {
        Object[] temp = new Object[data.length *2];
        // copy the current item in new array
        for(int i=0; i<data.length; i++)
        {
            temp[i]= data[i];
        }
        data = temp;

    }

    public T remove()
    {
        T removed = (T)data[--size];
        return removed;
    }

    public T get(int index)
    {
        return (T)data[index];
    }

    public int size()
    {
        return size;
    }

    public void set(int index,T value)
    {
        data[index]= value;
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(data) + "}" + "size = " + size;
    }



    public static void main(String[] args) {

        // now this class is restricted to NUMBERS type so you cant use string or other type
//       wildcards<String> list = new wildcards<>();

    }
}
