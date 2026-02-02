import java.util.*;

public class HighestAltitude {

    // Dynamic Programming method
    public static int largestAltitude(int[] gain) {
        int n = gain.length;

        // dp[i] = altitude after i steps
        int[] dp = new int[n + 1];
        dp[0] = 0;

        int maxAltitude = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + gain[i - 1];
            maxAltitude = Math.max(maxAltitude, dp[i]);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        System.out.print("Enter number of gains: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        // Read array elements
        System.out.println("Enter gain values:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int result = largestAltitude(gain);

        System.out.println("Highest Altitude: " + result);

        sc.close();
    }
}

