# Indian Coin Change (Greedy)

This program calculates the minimum number of coins/notes required to make a specific change using the Indian Currency system.

## 💡 Why Greedy Works
The Indian coin system is **canonical**. This means that for any amount, the greedy approach (taking the largest coin first) will always yield the optimal (minimum) number of coins. 

*Note: In some non-canonical systems (e.g., coins of {1, 3, 4}), Greedy might fail for an amount like 6 (Greedy gives 4+1+1=3 coins, but 3+3=2 coins is better). In those cases, you'd need **Dynamic Programming**.*

## 🚀 Usage
1. Define your denominations in an array.
2. Sort them in descending order.
3. Iteratively subtract the largest possible denomination until the amount is zero.

<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/cddaefec-341b-4c34-bd2b-4502ecc1ee0d" />
