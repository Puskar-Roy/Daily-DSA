import java.util.*;

public class leaders {
    public static ArrayList<Integer> findLaders(int[] arr,int n) {
        ArrayList<Integer> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                list.add(arr[i]);
            }
            max = Math.max(arr[i], max);

        }
        return list;
    }
}
