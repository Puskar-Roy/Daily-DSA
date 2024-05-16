
//moore's voting algorithm
public class majorityElement {
    public int majorityelement(int[] nums) {
        int target = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                target = nums[i];
            } else if (nums[i] == target) {
                count++;
            } else {
                count--;

            }
        }
        return target;

    }

}
