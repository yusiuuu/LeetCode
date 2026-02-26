# Maximum Length Chain of Pairs

Given a set of $n$ pairs, find the longest chain such that a pair $(c, d)$ can follow $(a, b)$ if $c > b$.

## 💡 Greedy Approach
This problem is a classic application of the **Greedy Algorithm**. 
1. **Sort:** Sort all pairs in increasing order of their second element.
2. **Select:** Initialize the first pair as the start of the chain.
3. **Iterate:** For every subsequent pair, if its first element is greater than the second element of the last added pair, include it in the chain.

## 🚀 Performance
- **Time:** $O(N \log N)$
- **Space:** $O(1)$

<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/080f5d67-2370-4a00-81a8-3b4b2e94f12c" />
