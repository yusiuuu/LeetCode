# Custom Stack Implementation using Deque

This project demonstrates how to build a functional **Stack** data structure using Java's `Deque` interface. 

## Key Features
- **Generics Support:** Can handle any object type (Integer, String, etc.).
- **Efficient Operations:** Utilizes `LinkedList` as the underlying provider for $O(1)$ insertions and deletions.
- **LIFO Logic:** Implements `push`, `pop`, and `peek` using `addLast` and `removeLast` methods.

<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/2c307238-b16c-4421-98c8-aa4cf7ba402c" />


## Metric,Complexity,Description

| Metric | Complexity | Description |
| --- | --- | --- |
|**Push**|O(1)|Adding to the end of a LinkedList or ArrayDeque is a constant time operation.|
|**Pop**|O(1)|Removing from the end is also constant time|
|**Peek**|O(1)|Accessing the last element requires no traversal|
|**Space Complexity**|O(N)|The stack stores N elements in memory|
