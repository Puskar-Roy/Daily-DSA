//  Check if Array Is Sorted and Rotated

// Example 1:
// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].


// Example 2:
// Input: nums = [2,1,3,4]
// Output: false
// Explanation: There is no sorted array once rotated that can make nums.


// Example 3:
// Input: nums = [1,2,3]
// Output: true
// Explanation: [1,2,3] is the original sorted array.
// You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.





public class checkArraySortedRoteted {
    public boolean check(int[] nums) {
        int ans = 0, size = nums.length;

        if (nums[0] < nums[size - 1]) {
            ans++;
        }

        for (int i = 1; i < size; i++) {
            if (nums[i - 1] > nums[i]) {
                ans++;

                if (ans > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
