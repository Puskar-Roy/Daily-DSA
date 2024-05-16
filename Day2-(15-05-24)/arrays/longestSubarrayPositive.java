
public class longestSubarrayPositive {
    public static int lenOfLongSubarr(int a[], int N, int K) {
        int n = a.length; 

        int left = 0, right = 0; 
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            
            while (left <= right && sum > K) {
                sum -= a[left];
                left++;
            }


            if (sum == K) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n)
                sum += a[right];
        }

        return maxLen;
    }
}
