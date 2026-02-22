## Logic Visualization
The Greedy strategy here is to always pick the next activity whose start time is greater than or equal to the end time of the previously selected activity.

## Step-by-Step Trace of your code:
- Activity 0: Ends at 2. Always pick the first one. (Selected: A0)
- Activity 1: Starts at 3. Since $3 \ge 2$, we pick it. Ends at 4. (Selected: A1)
- Activity 2: Starts at 0. Since $0 < 4$, we skip it.
- Activity 3: Starts at 5. Since $5 \ge 4$, we pick it. Ends at 7. (Selected: A3)
- Activity 4: Starts at 8. Since $8 \ge 7$, we pick it. Ends at 9. (Selected: A4)
- Activity 5: Starts at 5. Since $5 < 9$, we skip it.

Final Result: A0, A1, A3, A4 (4 Activities).
<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/0347cefc-6da6-44b4-879f-33e12111fe4b" />
