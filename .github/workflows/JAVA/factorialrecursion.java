import java.util.Scanner;

public class factorialrecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        // Read the input from the user
        int number = scanner.nextInt();
        // Close the scanner to prevent resource leak
        scanner.close();
        if (number < 0) {
        System.out.println("Factorial is not defined for negative numbers.");

}
} else {
long factorial = calculateFactorial(number);
System.out.println("Factorial of " +number+ " is: " + factorial);
}
}
public static long calculateFactorial(int n) {
if (n == 0 || n == 1) {
return 1;
} else {
return n * calculateFactorial(n - 1);
}
}


