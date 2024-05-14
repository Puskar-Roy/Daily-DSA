import java.util.Scanner;

public class largestelemrnt {
    public static void inputArray(int[] arr) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
        }

    }

    public static void printArray(int[] arr) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {

                System.out.println(arr[i]);
            }
        }
    }

    public static int largestElement(int[] arr){
        int largestNumber=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largestNumber){
                largestNumber = arr[i];
            }
        }
        return largestNumber;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Input Element - ");
        inputArray(arr);
        System.out.println("Print Element - ");
        printArray(arr);
        System.out.println("Largest Element - ");
        System.out.println(largestElement(arr));
    }
}
