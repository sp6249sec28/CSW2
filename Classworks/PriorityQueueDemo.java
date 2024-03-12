import java.util.*;
public class PriorityQueueDemo {
    public static void main(String[] args) throws Exception {
        PriorityQueue <Integer> myList = new PriorityQueue();
        System.out.println(myList.isEmpty());
        myList.offer(5);
        myList.offer(2);
        myList.offer(1);
        System.out.println(myList.isEmpty());
        System.out.println(myList.peek());
        myList.poll();
        System.out.println(myList);
    }
}
