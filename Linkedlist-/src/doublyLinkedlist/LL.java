package doublyLinkedlist;

public class LL {

    Node head;
    int size;

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null)
        {
            head.prev = node;
        }
        head = node;
        size+=1;
    }

    public void insertafter(int after, int val)
    {
        Node p = find(after);

        if(p== null)
        {
            System.out.println("does not exist ");
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null)
        {
            node.next.prev = node;
        }

    }
    public Node find(int index)
    {
        Node node = head;
        while(node!= null)
        {
            if(node.val == index)
            {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertLast(int val)
    {
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if(head == null)
        {
            node.prev = null;
            head = node;
            return;
        }

        while(last.next !=null)
        {
            last= last.next;
        }
        node.prev = last;
        last.next = node;
        size++;


    }

    public int getSize()
    {
        return size;
    }

    public void display()
    {
        Node node = head;
        Node last = null;
        while(node!=null)
        {
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("print in reverse ");
        while(last != null)
        {
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println();
    }


   private class Node{
       int val;
       Node next;
       Node prev;

       public Node(int val)
       {
           this.val= val;
       }
       public Node(int val , Node next, Node prev)
       {
           this.val = val;
           this.next=next;
           this.prev=prev;
       }

   }
}
