import java.util.*;
// Java program to demonstrate insert operation in binary search tree
class BinarySearchTree {
 
    /* Class containing left and right child of current node and key value*/
    class Node 
    {
        int key;
        Node left, right;
 
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
 
    // Root of BST
    Node root;
 
    // Constructor
    BinarySearchTree()
    { 
        root = null; 
    }
 
    // This method mainly calls insertRec()
    void insert(int key)
    {
       root = insertRec(root, key);
    }
     
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key)
    {
 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
 
    // This method mainly calls InorderRec()
    void inorder()
    {
       inorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
 
<<<<<<< HEAD
    // Driver Program to test above functions
=======
>>>>>>> 86efb7ad40a1d86d3aede34ebc72421381db0a0f
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);      
        int element;
        while(true)
        {
            System.out.println("Press 1 to enter data and 0 to display inorder traversal");
            int choice = sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter element to be addded to tree");
                element = sc.nextInt();
                tree.insert(element);
            }
            else
                break;
        }
 
        // print inorder traversal of the BST
        tree.inorder();
    }
}
// This code is contributed by Ankur Narain Verma
