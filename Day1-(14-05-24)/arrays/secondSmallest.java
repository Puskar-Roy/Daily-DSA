import java.util.Scanner;

public class secondSmallest {
    
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

    public static int secondsmallestElement(int[] arr) {
        int smallestNumber = arr[0];
        int ssmallestNumber = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= smallestNumber) {
                ssmallestNumber = smallestNumber;
                smallestNumber = arr[i];
            } else if (arr[i] >= smallestNumber && arr[i] >= ssmallestNumber) {
                ssmallestNumber = arr[i];
            }
        }
        return ssmallestNumber;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Input Element - ");
        inputArray(arr);
        System.out.println("Print Element - ");
        printArray(arr);
        System.out.println("Smallest Element - ");
        System.out.println(secondsmallestElement(arr));
    }
}
