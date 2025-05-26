import java.util.*;

public class Solution {

    public static long sumOrProduct(int n, int q) {
        final int MOD = 1_000_000_007;

        if (q == 1) {
            // Sum of first N natural numbers: n * (n + 1) / 2
            return (long) n * (n + 1) / 2;
        } else if (q == 2) {
            long product = 1;
            for (int i = 1; i <= n; i++) {
                product = (product * i) % MOD;
            }
            return product;
        }

        return -1; // In case of invalid query
    }

    public static void main(String[] args) {
        System.out.println(sumOrProduct(4, 1)); // Output: 10
        System.out.println(sumOrProduct(4, 2)); // Output: 24
    }
}
