package QueueInterface.ReverseQueue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Reverse {
    public static Queue<Integer> reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }
}
