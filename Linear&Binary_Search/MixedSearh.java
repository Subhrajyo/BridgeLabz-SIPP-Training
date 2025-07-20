import java.util.Arrays;

public class MixedSearh {
    // Linear search for first missing positive
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int expected = 1;
        for (int num : nums) {
            if (num == expected) expected++;
        }
        return expected;
    }

    // Binary Search for target
    public static int binarySearch(int[] nums, int target) {
        Arrays.sort(nums); // Ensure sorted
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
