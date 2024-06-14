class Node 
{
    int data;
    Node left;
    Node right;
    public Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
class BinaryTree 
{
    Node root;
    public BinaryTree() 
    {
        root = null;
    }
    public void insert(int data) 
    {
        root = insertRec(root, data);
    }
    public Node insertRec(Node temp, int data) 
    {
        if (temp == null) 
        {
            temp = new Node(data);
            return temp;
        }

        if (data < temp.data)
            temp.left = insertRec(temp.left, data);
        else if (data > temp.data)
            temp.right = insertRec(temp.right, data);

        return temp;
    }
    public void inOrderTraversal() {
        inOrderRec(root);
    }
    private void inOrderRec(Node temp) {
        if (temp != null) {
            inOrderRec(temp.left);
            System.out.print(temp.data + " "); 
            inOrderRec(temp.right); 
        }
    }
    public static void main(String[] args) 
    {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.println("Inorder traversal: ");
        tree.inOrderTraversal();
    }
}