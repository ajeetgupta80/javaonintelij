package generic;

import java.util.ArrayList;
import java.util.Arrays;

public class genericArrayList<T> {

    private  Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public genericArrayList()
    {
        this.data = new Object[DEFAULT_SIZE];
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
        genericArrayList<Integer> list = new genericArrayList<>();
        list.add(99);
        System.out.println(list);


        genericArrayList<String> name = new genericArrayList<>();
        name.add("ajeet");

        System.out.println(name);

    }
}
