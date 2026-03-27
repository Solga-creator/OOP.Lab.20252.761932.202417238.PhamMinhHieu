import java.util.Scanner;
public class calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the first number: ");
        String strNum1 = scanner.nextLine();

        System.out.print("Enter the second number: ");
        String strNum2 = scanner.nextLine();

        // Convert String to double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Calculate and display results
        System.out.println("\n--- Results ---");
        System.out.println("Sum:        " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product:    " + (num1 * num2));

        // Check divisor before dividing
        if (num2 == 0) {
            System.out.println("Quotient:   Cannot divide by zero!");
        } else {
            System.out.println("Quotient:   " + (num1 / num2));
        }
        scanner.close();
    }
}
