# Activity Selection with Sorting

This version of the program is more versatile. It can handle any set of activities, regardless of whether they are provided in chronological order.

## Algorithm
1. **Prepare:** Store activities as triples (index, start, end).
2. **Sort:** Use a Comparator to sort activities by their **finish times** in ascending order.
3. **Select:** - Pick the first activity.
   - For the rest, pick them only if their start time $\ge$ finish time of the last picked activity.

## Why sort by End Time?
Sorting by end time ensures we finish our current task as early as possible, leaving the most "room" in our schedule for future tasks.
<img width="1024" height="559" alt="image" src="https://github.com/user-attachments/assets/cd44dac5-1060-4fcf-88ae-ad9af8e73efb" />

