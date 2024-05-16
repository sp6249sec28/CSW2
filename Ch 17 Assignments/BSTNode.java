// package Ch 17 Assignments;
//Question 01
class BSTNode {
    int info;
    BSTNode left;    
    BSTNode right;
    public BSTNode(int info){
        this.info = info;
        this.left = left;
        this.right = right;
    }    
    public void insert(int value){
        if(value < info){
            if(left == null){
                left = new BSTNode(value);
            } else{
                left.insert(value);
            }
        } 
        else {
            if(right == null){
                right = new BSTNode(value);
            }
            else{
                right.insert(value);
            }
        }
    }
    public static void main(String[] args) {
        BSTNode root = new BSTNode(10);
        root.insert(4);
        root.insert(19);
        root.insert(7);
        root.insert(12);
        root.insert(20);
        root.insert(1);
        root.insert(5);
        root.insert(11);

        System.out.print("In Order: ");
        printInOrder(root);
        System.out.print("Pre Order: ");
        printPreOrder(root);
        System.out.print("Post Order: ");
        printPostOrder(root);

    }
    public static void printInOrder(BSTNode node) {
        if(node!= null){
            printInOrder(node.left);
            System.out.print(node.info + ", ");
            printInOrder(node.right);
        }
    }

    // Question 02
    public static void printPreOrder(BSTNode node) {
        if(node!= null){
            System.out.print(node.info + ", ");
            printInOrder(node.left);
            printInOrder(node.right);
        }
    }
    public static void printPostOrder(BSTNode node) {
        if(node!= null){
            printInOrder(node.left);
            printInOrder(node.right);
            System.out.print(node.info + ", ");
            
        }
    }
}
