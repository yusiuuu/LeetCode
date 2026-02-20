# Reverse a Queue using a Stack

This Java utility demonstrates how to reverse the order of elements in a `java.util.Queue` by leveraging the Last-In-First-Out (LIFO) property of a `Stack`.

## How it Works
1. All elements are dequeued from the **Queue** and pushed onto a **Stack**.
2. Because the stack reverses the order, the last element added to the queue becomes the top of the stack.
3. Elements are then popped from the **Stack** and enqueued back into the **Queue**.

<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/e766a7c2-de6b-41aa-8ac8-2235c3ccca4c" />


## Complexity
- **Time:** O(N)
- **Space:** O(N)
