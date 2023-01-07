public class treerepresentation {
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(1);
        preorder(root);


    }

   static class Node {
        int data;
        Node left;
        Node right;
        public Node(int key)
        {
            data = key;
        }
    }
    static void preorder(Node root)
    {
        if(root == null )
        {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
}
