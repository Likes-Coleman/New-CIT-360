import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Iterator;

public class Collection_Queue {
    public static void main(String[] args) {

        // Creates an object named queue.
        Queue queue = new PriorityQueue();
        queue.add("This");
        queue.add("is");
        queue.add("a");
        queue.add("Queue");
        queue.add("type.");

        // Loops the collection class of queue.
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(queue.poll());
        }
    }
}
