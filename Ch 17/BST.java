import java.util.Scanner;
//Class representing a node in the BST
class Node{
    int data;
    Node left, right;
    public Node(int item){
        data = item;
        left = right = null;
    }
}
//Class for BST operations
class BinarySearchTree{
    Node root;  //Root of the BST
    BinarySearchTree(){
        root = null;
    }

    //Method to insert a new key in the BST
    void insert(int data){
        root = insertRec(root, data);
    }
    Node insertRec(Node root, int data){
        if(root==null){
            root = new Node(data);
            return root;
        }
        if(data < root.data)
            root.left = insertRec(root.left, data);
        else if(data > root.data)
            root.right = insertRec(root.right, data);
            return root;    
    }

    //Method to delete a key from the BST
    void dltKey(int data){
        root = deleteRec(root, data);
    }
    Node deleteRec(Node root, int data){
        if(root == null) return root;
        if(data < root.data)
            root.left = deleteRec(root.left, data);
        else if(data > root.data)
            root.right = deleteRec(root.right, data);
        else{
            if(root.left == null) 
                return root.right;
            else if(root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }
    int minValue(Node root){
        int minValue = root.data;
        while(root.left != null){
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    //Inorder traversal of the BST
    void inorder(){
        inOrderRec(root);
    }
    void inOrderRec(Node root){
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    //PreOrder Traversal of the BST
    void preorder() { 
        preOrderRec(root);  
    }
    void preOrderRec(Node root){
        if(root!=null){
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    //PostOrder Traversal of the BST
    void postorder(){
        postOrderRec(root);
    }
    void postOrderRec(Node root){
        if(root!=null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}
//Public class to run the BST operations
public class BST {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("1.Insert \n2.Delete \n3.In-order \n4.Pre-Order \n5.Post-Order \nSelect an option");
        int a = sc.nextInt();  
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(40);
        tree.insert(50);
        tree.insert(10);
        tree.insert(60);
        tree.insert(90);
        tree.insert(30);
        tree.insert(70);
        System.out.println("InOrder Traversal of the given tree: ");
        tree.inorder();
        System.out.println("\nPreOrder traversal of the given tree: ");
        tree.preorder();
        System.out.println("\nPostOrder traversal of the given tree: ");
        tree.postorder();

        System.out.println("\nDelete 20");
        tree.dltKey(20);
        System.out.println("InOrder Traversal of the modified tree: ");
        tree.inorder();

        System.out.println("\nDelete 30");
        tree.dltKey(30);
        System.out.println("InOrder Traversal of the modified tree: ");
        tree.inorder();

        System.out.println("\nDelete 50");
        tree.dltKey(50);
        System.out.println("InOrder Traversal of the modified tree: ");
        tree.inorder();
    }
}
