import java.util.Scanner;

public class IT26102574Lab9Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter value a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant (b^2 - 4ac) using Math.pow()
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        // Calculate the two possible values for x using Math.sqrt()
        double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        // Output the results (Depending on your specific tutorial output format, 
        // you can display x1 and x2 here)
        System.out.println("Root 1 (x1) = " + x1);
        System.out.println("Root 2 (x2) = " + x2);

        scanner.close();
    }
}