// package Ch 17 Assignments;
//Question 06

class treeNode{
    int val;
    treeNode left, right;
    
    public treeNode(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
public class q6 {
    public static boolean isBST(treeNode root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static boolean isBST(treeNode node, int min, int max){
        if(node==null)
            return true;
        if(node.val < min || node.val > max)
            return false;
        return (isBST(node.left, min, node.val-1) && isBST(node.right, node.val+1, max));    
    }
    public static void main(String[] args) {
        treeNode root = new treeNode(10);
        root.left = new treeNode(5);
        root.right = new treeNode(10);
        root.left.left = new treeNode(3);
        root.left.right = new treeNode(7);
        root.right.left = new treeNode(12);
        root.right.right = new treeNode(20);

        if(isBST(root)){
            System.out.println("The given binary tree is a BST.");
        } else{
            System.out.println("The given binary tree is not a BST.");
        }
    }
}
