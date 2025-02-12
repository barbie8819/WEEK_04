package QueueInterface.ReverseQueue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Original Queue : "+queue);
        System.out.println("Reverse Queue : "+Reverse.reverse(queue));
    }
}
