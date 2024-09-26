package stacksandarrays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class stacks {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // System.out.println(queue.remove());
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(29);
        deque.add(78);
        deque.addLast(90);
        deque.addFirst(20);
        System.out.println(deque.removeFirst());
        
    }
}
