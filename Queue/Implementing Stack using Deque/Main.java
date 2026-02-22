import java.util.*;

public class Main {
    // Added <T> to make it a generic Stack
    public static class Stack<T> {
        Deque<T> dq = new LinkedList<>();

        public void push(T data) {
            dq.addLast(data);
        }

        public T pop() {
            return dq.removeLast();
        }

        public T peek() {
            return dq.getLast();
        }

        // Added this method so the while loop works
        public boolean isEmpty() {
            return dq.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= 10; i++) {
            s.push(i);
        }

        System.out.println("Peek: " + s.peek());

        System.out.print("Stack elements: ");
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
