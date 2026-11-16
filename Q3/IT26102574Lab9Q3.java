public class IT26102574Lab9Q3 {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to calculate the square of an integer
    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        // Expression 1: (3 * 4 + 5 * 7)^2
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        // Display results
        System.out.println("Result of expression 1: " + result1);
        System.out.println("Result of expression 2: " + result2);
    }
}