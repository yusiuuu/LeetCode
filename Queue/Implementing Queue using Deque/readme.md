# Custom Queue Implementation using Deque

This project demonstrates a manual implementation of a **Generic Queue** in Java. By wrapping a `Deque`, we ensure that the internal logic strictly follows the Queue protocol.

## Features
- **FIFO Logic:** Elements are added at the back and removed from the front.
- **Type Safety:** Uses Java Generics (`<T>`) to allow queues of any object type.
- **Underlying Structure:** Built upon `java.util.Deque`, providing high performance for both insertion and deletion.

## Methods
1. `add(data)`: Appends an element to the end.
2. `remove()`: Retrieves and removes the head of the queue.
3. `peek()`: Retrieves, but does not remove, the head.
4. `isEmpty()`: Returns true if the queue is empty.

<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/93255832-1614-4012-a8bd-b17825bed834" />


## Metric,Complexity,Description
| Metric | Complexity | Description |
| --- | --- | --- |
|**Add (Enqueue)**|O(1)|Adding to the tail of a LinkedList is a constant time operation.|
|**Remove (Dequeue)**|O(1)|Removing from the head is also constant time.|
|**Peek**|O(1)|Looking at the first element is immediate.|
|**Space Complexity**|O(N)|The queue stores all N elements in the Deque.|
