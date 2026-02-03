import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        // Step 1: Read the two numbers from the user
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            
            // Step 2: Calculate the GCD
            int gcd = findGCD(num1, num2);
            
            // Step 3: Display the GCD
            System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
        }
    }
    
    // Method to find the GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}