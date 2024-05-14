public class moveZerosEnd {
    
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int zero = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }

        if (zero == -1) {
            return;
        }
        for (int j = zero + 1; j < n; j++) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[zero];
                nums[zero] = temp;
                zero++;
            }
        }
    }
}
