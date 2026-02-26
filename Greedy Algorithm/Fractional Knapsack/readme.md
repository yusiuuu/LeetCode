# Fractional Knapsack Problem (Greedy Approach)

The goal is to fill a knapsack of capacity `W` with items to get the maximum total value. In the **fractional** version, we can break items to fit the remaining capacity.

## 💡 The Strategy
1. Calculate the **unit value** (Value / Weight) for every item.
2. Sort items in descending order of this ratio.
3. Pick the item with the highest ratio first.
4. If the full item fits, take it. If not, take the fraction that fills the bag.

## 🚀 Performance
- **Time:** $O(N \log N)$ for sorting.
- **Space:** $O(N)$ for storing ratios.

## Example Output
For values `[60, 100, 120]` and weights `[10, 20, 30]` with capacity `50`:
**Max Value:** `240.0`

<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/f7614220-5c4f-49d9-970b-9368634021b3" />
