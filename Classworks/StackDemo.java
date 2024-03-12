import java.util.*;
public class StackDemo {
    public static void main(String[] args) throws java.lang.Exception{
        Stack<Integer> myList = new Stack();
        myList.push(5);
        myList.push(2);
        myList.push(1);
        System.out.println(myList.peek());
        System.out.println(myList.search(5));
        myList.pop();
        System.out.println(myList.empty());
        System.out.println(myList);

    }
}
