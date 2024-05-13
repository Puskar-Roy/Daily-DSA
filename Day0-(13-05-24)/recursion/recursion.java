
/**
 * recursion
 */
import java.util.Scanner;

public class recursion{
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter Number - ");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
}



