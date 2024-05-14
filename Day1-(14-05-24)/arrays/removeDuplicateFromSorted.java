public class removeDuplicateFromSorted {
    
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (nums[ans] != nums[i]) {
                ans++;
                nums[ans] = nums[i];
            }
        }
        return ans + 1;
    }
    public static void main(String[] args) {
        
    }
}
