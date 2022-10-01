package Customqueue;

public class customqueue {

    private int data[];
    private static final int DEFAULT_SIZE = 10;
    int end =0;

    public customqueue()
    {
        this(DEFAULT_SIZE);
    }
    public customqueue(int size)
    {
        this.data = new int[size];
    }

    public boolean insert(int item)
    {
        if(isFull())
        {
            System.out.println("queue is fucking full !!");
            return false;
        }
        data[end++]= item;
        return true;

    }
    public int remove() throws Exception {
        if(isEmpty())
        {
            throw new Exception("queue is Empty you asshole  ");
        }
        int removed = data[0];
//        shifting all the ellements one beside

        for(int i=1; i<end; i++)
        {
            data[i-1]= data[i];
        }

        end--;
        return removed;
    }

    public int front() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("queue is empty");
        }
        return data[0];
    }

    public void display()
    {
        for(int i =0; i<end; i++)
        {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }


    public boolean isFull()
    {
        return end == data.length-1;  // ptr is at the last index
    }

    public boolean isEmpty()
    {
        return end == 0;
    }



}
