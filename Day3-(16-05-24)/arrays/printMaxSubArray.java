
public class printMaxSubArray {
    public static void printSubArray(int[] arr) {
        int n = arr.length;
        int sum = 0, max = 0;
        int start = 0;
        int startI = -1, endI = -1;

        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i;
            }
            sum = sum + arr[i];
            if (sum < 0) {
                sum = 0;
            }

            if (sum > max) {
                max = sum;
                startI = start;
                endI = i;

            }

        }
        System.out.println(startI);
        System.out.println(endI);
    }
}
