import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("1. First-degree equation (ax + b = 0)");
        System.out.println("2. System of first-degree equations with 2 variables");
        System.out.println("3. Second-degree equation (ax² + bx + c = 0)");
        System.out.print("\nEnter your choice (1-3): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                solveLinearEquation(scanner);
                break;
            case 2:
                solveLinearSystem(scanner);
                break;
            case 3:
                solveQuadraticEquation(scanner);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
    public static void solveLinearEquation(Scanner sc) {
        System.out.println("\n--- First-degree Equation (ax + b = 0) ---");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Many solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x = -b / a;
            System.out.printf("Solution: x = %.4f%n", x);
        }
    }
    public static void solveLinearSystem(Scanner sc) {
        System.out.println("\n--- System of First-degree Equations ---");
        System.out.println("a11*x1 + a12*x2 = b1");
        System.out.println("a21*x1 + a22*x2 = b2");

        System.out.print("a11: "); double a11 = sc.nextDouble();
        System.out.print("a12: "); double a12 = sc.nextDouble();
        System.out.print("b1 : "); double b1  = sc.nextDouble();
        System.out.print("a21: "); double a21 = sc.nextDouble();
        System.out.print("a22: "); double a22 = sc.nextDouble();
        System.out.print("b2 : "); double b2  = sc.nextDouble();

        double D  = a11 * a22 - a21 * a12;   
        double D1 = b1  * a22 - b2  * a12;
        double D2 = a11 * b2  - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Many solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.printf("Solution: x1 = %.4f, x2 = %.4f%n", x1, x2);
        }
    }
    public static void solveQuadraticEquation(Scanner sc) {
        System.out.println("\n--- Second-degree Equation (ax² + bx + c = 0) ---");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) System.out.println("Many solutions.");
                else System.out.println("No solution.");
            } else {
                System.out.printf("Solution: x = %.4f%n", -c / b);
            }
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("The equation has no real roots.");
        } 
        else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("Double root: x = %.4f%n", x);
        } 
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Two real roots: x1 = %.4f, x2 = %.4f%n", x1, x2);
        }
    }
}