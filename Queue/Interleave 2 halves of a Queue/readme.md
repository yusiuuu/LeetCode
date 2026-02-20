# Interleaving the First Half of a Queue

This project provides a Java implementation of an algorithm to interleave the first half of a queue with the second half. This is a common coding challenge involving the **Queue Data Structure**.

## 📝 Problem Statement
Given a queue of even size, rearrange the elements by interleaving the first half of the queue with the second half.

**Example:**
* **Input:** `[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]`
* **Output:** `[1, 6, 2, 7, 3, 8, 4, 9, 5, 10]`

---

## 🛠️ Logic & Algorithm

<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/912ac64c-c485-496d-8e08-10d9848924b8" />


The approach uses a secondary **temporary queue** to hold the first half of the elements.


### Steps:
1.  **Divide:** Push the first $N/2$ elements from the original queue into a temporary queue (`firstHalf`).
2.  **Interleave Loop:** * Remove an element from `firstHalf` and add it back to the original queue.
    * Remove the current front of the original queue and immediately add it to the back.
3.  Repeat until the temporary queue is empty.

---

### 📊 Complexity Analysis

| Metric | Complexity | Description |
| --- | --- | --- |
| **Time Complexity** |  O(N)| The algorithm traverses the queue elements a constant number of times (once to split and once to interleave). |
| **Space Complexity** |  O(N)| An auxiliary queue is used to store exactly half of the elements (), which simplifies to linear space. |

---
