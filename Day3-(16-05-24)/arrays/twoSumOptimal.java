import java.util.*;;
public class twoSumOptimal {
    public static boolean checkTwoSum(int[] arr,int target){
        Arrays.sort(arr);
        int n = arr.length;
        int left=0,right=n-1;
        while (left<right) {
            if(arr[left] + arr[right] == target){
                return true;
            }
            if(arr[left] + arr[right] <= target){
                left++;
            }
            if(arr[left] + arr[right] >= target){
                right--;
            }
        }
        return false;
    }
}
