import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumK {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // To handle subarrays starting from index 0
        map.put(0, 1);

        int currSum = 0;
        int count = 0;

        for (int num : nums) {
            currSum += num;

            // Check if there exists a prefix sum such that
            // currSum - prefixSum = k
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            // Store current prefix sum frequency
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + " = " + result);

        sc.close();
    }
}
