import java.util.*;

class SearchInsPos {

    // Function to find search insert position
    public static  int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;          // target found
            } 
            else if (nums[mid] > target) {
                high = mid - 1;      // move left
            } 
            else {
                low = mid + 1;       // move right
            }
        }

        return low; // insert position
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Read array elements (sorted order)
        System.out.println("Enter array elements (sorted):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Read target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        
        int result = searchInsert(nums, target);

        System.out.println("Search Insert Position: " + result);

        sc.close();
    }
}
