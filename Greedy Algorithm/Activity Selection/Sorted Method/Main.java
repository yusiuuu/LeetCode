import java.util.*;

public class Main {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // 2D Array to store: [index, start, end]
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;           // Original Index
            activities[i][1] = start[i];    // Corrected: start[i] not start
            activities[i][2] = end[i];      // Corrected: end[i] not end
        }

        // Sort 2D array based on the end time (column 2)
        // Fixed: Added missing closing parenthesis
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity always chosen
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < activities.length; i++) {
            // Logic Fix: Check sorted start time [i][1] against lastEnd
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}
