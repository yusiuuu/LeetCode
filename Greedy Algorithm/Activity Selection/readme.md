# 📅 Activity Selection: The Greedy Strategy

The Activity Selection problem is a classic optimization puzzle. You have a set of activities, each with a start and finish time, and you can only perform one at a time. The goal is to maximize the **count** of activities you finish.

---

### 1. The Greedy Approach ($n_1$)
The Greedy rule is simple: **Always pick the activity that finishes first.**

By choosing the task that ends the earliest, you keep your "schedule" as open as possible for whatever comes next. 
* Let the total number of activities selected by this method be **$n_1$**.



---

### 2. The "Optimal" Approach ($n_2$)
Imagine someone claims there is a "better" strategy (like picking a task because it starts early or is very short). They claim this strategy yields a total number of activities **$n_2$**, and they argue that **$n_2 > n_1$**.

---

### 3. Proving $n_1 = n_2$ (The Replacement Argument)
To prove Greedy is optimal, we use a "Swap" logic. Suppose the "Optimal" list ($n_2$) starts with Activity **B**, while our Greedy list ($n_1$) starts with Activity **A**.

#### The Logic:
1.  **The Finisher:** Because Greedy always picks the earliest finisher, we know **Finish(A) ≤ Finish(B)**.
2.  **The Swap:** If we take the "Optimal" list and replace **B** with **A**, the schedule **cannot break**. Why? Because **A** finishes even earlier than **B**, so there is no chance **A** will overlap with the next activity in the "Optimal" list.
3.  **The Result:** We now have a list that is just as long as the "Optimal" one, but it starts with our Greedy choice.



#### Conclusion:
You can repeat this swap for every single activity. You will eventually turn the "Optimal" list into the "Greedy" list without ever reducing the total count of activities. This proves that no other strategy can beat Greedy.
* Therefore, $n_2$ can never be greater than $n_1$.
* Since $n_1$ is achieved by Greedy, **$n_1 = n_2$**.

---

### 💡 TL;DR for an 18-Year-Old
Think of a **Music Festival** with overlapping sets.
* **Greedy Strategy:** You always go to see the band that finishes their set the earliest. 
* **Why?** Because the sooner you are free, the more likely you are to catch the start of another set. 

You can't catch *more* bands by staying at a long set and hoping the next stage stays empty. By being "Greedy" for free time, you guarantee you see the most music possible.

---

### 📊 Complexity Breakdown

| Approach | Sorting Required? | Time Complexity |
| :--- | :--- | :--- |
| **Sorted by End Time** | No (Already Sorted) | $O(N)$ |
| **Unsorted Input** | Yes | $O(N \log N)$ |
