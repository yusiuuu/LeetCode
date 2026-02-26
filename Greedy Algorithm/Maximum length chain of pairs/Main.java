import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] pairs = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        
        // Sort pairs based on the second number (the "end" of the pair)
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        
        int chainLen = 1;
        int chainEnd = pairs[0][1]; // End of the first (earliest finishing) pair
        
        for (int i = 1; i < pairs.length; i++) {
            // A pair (c, d) can follow (a, b) if c > b
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        
        System.out.println("Max Length of Chain is: " + chainLen);
    }
}
