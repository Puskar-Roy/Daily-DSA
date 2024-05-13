import java.util.Scanner;

public class array {

    public static void inputArray(int [] arr) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
        }
        
      
    }
    public static void printArray(int [] arr) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                
                System.out.println(arr[i]);
            }
        }
        
      
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        inputArray(arr);
        printArray(arr);

    }
}