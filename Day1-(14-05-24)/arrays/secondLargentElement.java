import java.util.Scanner;

public class secondLargentElement {

    public static void inputArray(int[] arr) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
        }

    }

    public static void printArray(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);
        }

    }

    public static int secondlargestElement(int[] arr) {
        int largestNumber = arr[0];
        int slargestNumber = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= largestNumber) {
                slargestNumber = largestNumber;
                largestNumber = arr[i];
            } else if (arr[i] <= largestNumber && arr[i] >= slargestNumber) {
                slargestNumber = arr[i];
            }
        }
        return slargestNumber;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Input Element - ");
        inputArray(arr);
        System.out.println("Print Element - ");
        printArray(arr);
        System.out.println("Largest Element - ");
        System.out.println(secondlargestElement(arr));
    }
}
