import java.util.*;

public class Main {
    // Custom Queue using Deque
    public static class Queue<T> {
        Deque<T> dq = new LinkedList<>();

        // Enqueue: Add to the back
        public void add(T data) {
            dq.addLast(data);
        }

        // Dequeue: Remove from the front
        public T remove() {
            return dq.removeFirst();
        }

        public T peek() {
            return dq.getFirst();
        }

        public boolean isEmpty() {
            return dq.isEmpty();
        }
    }

    public static void main(String[] args) {
        // Added the diamond operator <> for clean generics
        Queue<Integer> q = new Queue<>(); 
        
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        System.out.println("Peek (Front of Queue): " + q.peek());

        System.out.print("Queue elements (FIFO order): ");
        while (!q.isEmpty()) {
            // Changed .pop() to .remove() to match your class definition
            System.out.print(q.remove() + " ");
        }
    }
}
