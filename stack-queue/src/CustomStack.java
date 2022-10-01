
public class CustomStack {
    protected int data[];
    private static final int DEFAULT_SIZE = 10;
   private int ptr = -1;

    public CustomStack()
    {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size)
    {
        this.data = new int[size];
    }

    public boolean push(int item) throws stackExeception {
        if(isFull())
        {
            throw new stackExeception("ass hole stack is full");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws stackExeception {
        if(isEmpty())
        {
            throw new stackExeception("cannot pop from an empty stack !!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws stackExeception {
        if(isEmpty())
        {
            throw new stackExeception("cannot peek from an empty stack !!");
        }
        return data[ptr];
    }

    public boolean isFull()
    {
        return ptr == data.length-1;  // ptr is at the last index
    }

    public boolean isEmpty()
    {
        return ptr == -1;
    }
}
