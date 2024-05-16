// Check DNF
public class sortZeroOneTwo {
    public void sortArray(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, right = n - 1;
        while (mid <= right) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;

            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }

        }
    } 
}
