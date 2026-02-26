import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int w = 50;

        // ratio[i][0] = original index, ratio[i][1] = value/weight ratio
        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        // Sort by ratio in ascending order (we'll loop backwards for greedy)
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        double finalValue = 0; // Changed to double to handle fractional parts

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                // Take the whole item
                finalValue += value[idx];
                capacity -= weight[idx];
            } else {
                // Take fractional part
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final Max Value: " + finalValue);
    }
}
