# Minimum Sum Absolute Difference Pairs

This algorithm finds the minimum possible sum of absolute differences between elements of two equal-sized arrays by pairing them optimally.

## 💡 Why Sorting Works (Greedy Proof)
To minimize $|a_i - b_i|$, we need $a_i$ and $b_i$ to be as close to each other as possible. 
- If we pair the smallest element of Array A with the smallest of Array B, we reduce the "gap." 
- If we paired the smallest of A with the largest of B, the difference would be maximized, which is the opposite of our goal.

## 🚀 Complexity
- **Time:** $O(N \log N)$ due to sorting.
- **Space:** $O(1)$ (or $O(N)$ depending on the sorting implementation's stack space).

## Example
**Input:** `A = [4, 1, 8, 7]`, `B = [2, 3, 6, 5]`  
**Output:** `6`
<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/1df5d5d5-7fd6-49f4-bd06-73b5db7fde54" />
