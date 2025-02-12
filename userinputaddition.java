import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2; // Perform addition
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);   // Output the result
        scanner.close();
    }
}
