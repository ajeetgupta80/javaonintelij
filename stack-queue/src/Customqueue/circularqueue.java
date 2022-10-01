package Customqueue;

public class circularqueue {
    protected int data[];
    private static final int DEFAULT_SIZE = 10;
    protected int end =0;
    protected int front = 0;
    private int size = 0;

    public circularqueue()
    {
        this(DEFAULT_SIZE);
    }
    public circularqueue(int size)
    {
        this.data = new int[size];
    }

    public boolean isFull()
    {
        return size == data.length-1;  // ptr is at the last index
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean insert(int item)
    {
        if(isFull())
        {
            System.out.println("queue is fucking full !!");
            return false;
        }
        data[end++]= item;
        end = end % data.length;
        size++;
        return true;

    }

    public int remove() throws Exception {
        if(isEmpty())
        {
            throw new Exception("queue is Empty you asshole  ");
        }
        int removed = data[front++];
        front = front % data.length;



        size--;
        return removed;
    }

    public int front() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("queue is empty");
        }
        return data[front];
    }

    public void display()
    {
      int i = front;
      if(isEmpty())
      {
          System.out.println("que is empty ");
          return;
      }

      do{
          System.out.print(data[i] + " ->");
          i++;
          i %= data.length;

      }while(i!= end);
        System.out.println("END");
    }






}
