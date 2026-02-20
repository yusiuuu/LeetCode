import java.util.*;

public class Main {
    // Logic: Queue -> Stack (Reverses order) -> Queue
    public static void rev(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        
        // Step 1: Drain queue into stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        
        // Step 2: Pop from stack back into queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        System.out.println("Original: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        
        rev(q);

        System.out.print("Reversed: ");
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
