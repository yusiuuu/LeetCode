import java.util.*;

public class Main {
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
      
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            // Add element from first half
            q.add(firstHalf.remove());
            // Take the current front of q (from the second half) and move it to the back
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Adding 10 elements: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }
        interLeave(q);
        // Printing results
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
