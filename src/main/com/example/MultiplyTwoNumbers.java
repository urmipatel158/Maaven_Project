package MultiplyTwoNumbers;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        // Declare required variables
        int x, y, multiplication;

        // Create scanner object to take dynamic input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        x = sc.nextInt(); // Taking first number
        
        System.out.print("Enter second number: ");
        y = sc.nextInt(); // Taking second number
        
        // Calculate the multiplication
        multiplication = x * y;
        
        // Print the calculated value
        System.out.println("The Multiplication of the given two Numbers: " + multiplication);
        
        sc.close(); // Close the scanner
    }
}
