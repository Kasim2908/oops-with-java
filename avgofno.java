import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object to take input from the user
        System.out.print("Enter the number of elements: "); // Ask the user how many numbers they want to input
        int n = scanner.nextInt();
        int[] numbers = new int[n]; // Declare an array to store the numbers
        System.out.println("Enter the numbers:"); // userinput
        int sum = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];  // Add each number to the sum
        }
        // Calculate the average
        double average = (double) sum / n;
        System.out.println("The average is: " + average);
        // Close the scanner
        scanner.close();
    }
}
