import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Integer array is needed to use Comparator.reverseOrder()
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int amount = 590;
        
        // Sort descending: 2000, 500, 100, 50, 20, 10, 5, 2, 1
        Arrays.sort(coins, Comparator.reverseOrder());
        
        noOfCoins(coins, amount);
    }

    public static void noOfCoins(Integer[] coins, int amount) {
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Total minimum coins used: " + count);
        System.out.print("Coins used: ");
        for (int coin : ans) {
            System.out.print(coin + " "); // Just print 'coin' directly
        }
    }
}
