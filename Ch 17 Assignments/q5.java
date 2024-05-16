// package Ch 17 Assignments;
//Question 05

class treeNode{
    int val;
    treeNode left, right;
    
    public treeNode(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
public class q5 {
    public static treeNode createTree(int[] arr){
        if(arr==null || arr.length==0){
            return null;
        }
        return createTree(arr, 0, arr.length-1);
    }   
    private static treeNode createTree(int[] arr, int start, int end) {
        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        treeNode root = new treeNode(arr[mid]);
        root.left = createTree(arr, start, mid - 1);
        root.right = createTree(arr, mid + 1, end);
        return root;
    }
    public static void inOrderTraversal(treeNode root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        int[] arr = {23,75,78,23,56,97,01,56,86,43};
        treeNode root = createTree(arr);
        inOrderTraversal(root);
    }
}
