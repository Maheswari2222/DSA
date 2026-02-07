import java.util.*;

public class Countingbits {

    // Function to return array of bit counts from 0 to n
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        // Base case
        ans[0] = 0;

        // Build results in one pass
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] result = countBits(n);

        System.out.println("Output:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}

