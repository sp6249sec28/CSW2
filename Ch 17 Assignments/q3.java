// package Ch 17 Assignments;
// Question 03
import java.util.*;
class Country {
    private String name;
    private int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
}

class BNode {
    Country info;
    BNode left;
    BNode right;

    public BNode(Country info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }
}

class BST {
    BNode root;

    public BST() {
        this.root = null;
    }

    public void insert(Country country) {
        root = insertRec(root, country);
    }

    private BNode insertRec(BNode node, Country country) {
        if (node == null) {
            node = new BNode(country);
            return node;
        }
        if (country.getName().compareTo(node.info.getName()) < 0) {
            node.left = (insertRec(node.left, country));
        } else if (country.getName().compareTo(node.info.getName()) > 0) {
            node.right = (insertRec(node.right, country));
        }
        return node;
    }

    //Question 04
    public void levelOrderTraversal(){
        if(root == null){
            return;
        }
        Queue<BNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            BNode temp = queue.poll();
            System.out.print(temp.info.getName() + " " + temp.info.getPopulation());
            if(temp.left != null){
                queue.offer(temp.left);
            }
            if(temp.right != null){
                queue.offer(temp.right);
            }
        }
    }
    public BNode findMax(){
        if(root==null){
            return null;
        }
        BNode temp = root; 
        while(temp.right != null){
            temp = temp.right;
        }
        return temp;
    }
    public BNode findMin(){
        if(root==null){
            return null;
        }
        BNode temp = root; 
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }
}

public class q3 {
    public static void main(String[] args) {
        BST bst = new BST();
        // Add countries to the tree (in any order).
        bst.insert(new Country("China", 9340923));
        bst.insert(new Country("India", 97567943));
        bst.insert(new Country("UnitedStates", 87098743));
        bst.insert(new Country("Canada ", 28374982));
        bst.insert(new Country("Brazil   ", 29782437));
        System.out.println("\nBinary Search Tree: ");
        printInOrder(bst.root);

        bst.levelOrderTraversal();
        BNode maxNode = bst.findMax();
        System.out.println(maxNode.info.getName() + ", " + maxNode.info.getPopulation());
        BNode minNode = bst.findMin();
        System.out.println(minNode.info.getName() + ", " + minNode.info.getPopulation());
    }

    public static void printInOrder(BNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.println(root.info.getName() + ": " + root.info.getPopulation());
            printInOrder(root.right);
        }
    }
}
