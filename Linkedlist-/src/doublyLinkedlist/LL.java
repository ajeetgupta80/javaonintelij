package doublyLinkedlist;

public class LL {

    Node head;

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        if(head != null)
        {
            node.prev = null;
        }
        head = null;
    }

    public void display()
    {
        Node node = head;
        while(head!=null)
        {

        }
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
