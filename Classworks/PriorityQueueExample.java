import java.util.*;
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> prQueue = new PriorityQueue();
        //Add the items
        prQueue.add("C");
        prQueue.add("Java");
        prQueue.add("Python");
        prQueue.add("C++");
        System.out.println("The head value by using peak function is: " + prQueue.peek());
        System.out.println("The total queue elements are: ");
        Iterator itr1 = prQueue.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
        //Removing the top priority element
        prQueue.poll();
        System.out.println("After removing the element with poll function: ");
        Iterator<String> itr2 = prQueue.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        //Removing one value of Java
        prQueue.remove("Java");
        System.out.println("After removing Java with remove function: ");
        Iterator<String> itr3 = prQueue.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }
        //Checking a paritcular element in the PriorityQueue
        boolean a = prQueue.contains("C");
        System.out.println("Does this priority queue contains C : " + a);
    }
}
