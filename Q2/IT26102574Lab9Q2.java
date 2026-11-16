import java.util.Scanner;

public class IT26102574Lab9Q2 {

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get radius from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Call the circleArea() method
        double result = circleArea(radius);

        // Display the result
        System.out.println("The area of the circle with radius "
                + radius + " is : " + result);

        input.close();
    }
}