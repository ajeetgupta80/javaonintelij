import org.w3c.dom.Node;

import java.util.PrimitiveIterator;

public class LL {

    private Node head;
    private Node tail;

    private int size;
    public LL()
    {
        this.size=0;
    }

    public void insertFirst(int val)
    {
        // create a new node first off all
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }
        size+=1;

    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value+"-> ");
            temp = temp.next;
        }
    }

    public int getSiz()
    {
        return size;
    }

    public void insert(int val , int index)
    {
        if(index == 0)
        {
            insertFirst(val);
            return;
        }
        if(index == size)
        {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++)
        {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next =node;

        size+=1;
    }

//    insertion using recursion -------------------------------------------------------------------------------------------
    public void insertrec(int val , int index)
    {
        head = insertrec(val, index , head);

    }
    private Node insertrec(int val, int index , Node node)
    {
        if(index == 0)
        {
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertrec(val , index-1, node.next);
        return node;

    }
    public int deleteFirst()
    {
        int temp = head.value;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        size--;
        return temp;
    }
    public int deleteLast()
    {
        if(size<=1)
        {
            return deleteFirst();
        }
        Node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next= null;
        return val;
    }
    public Node get(int index)
    {
        Node node = head;
        for(int i=0; i<index; i++)
        {
            node = node.next;
        }
        return node;
    }

    public int delete(int index)
    {
        if(index == 0)
        {
            return deleteFirst();
        }
        if(index == size-1)
        {
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }



    public void insertLast(int val)
    {
        if(tail == null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public Node find(int value)
    {
        Node node = head;
        while(node!=null)
        {
            if(node.value == value)
                return node;

            node = node.next;
        }
        return null;

    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value=value;
        }
        public Node(int value, Node next)
        {
            this.value= value;
            this.next=next;
        }

    }

    // question specific functions
    public void removeDuplicates()
    {
        Node node = head;

        while(node.next != null)
        {
            if(node.value == node.next.value)
            {
                node.next = node.next.next;
                size--;
            }
            else
            {
                node = node.next;
            }
            tail = node;
            tail.next = null;
        }

    }



    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.display();
        System.out.println();
        list.removeDuplicates();
        list.display();
    }




}
