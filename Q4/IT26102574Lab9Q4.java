import java.util.Scanner;

public class IT26102574Lab9Q4 {

    // a) Method to calculate the final mark
    public static double calcFinalMark(double assignmentMark, double examMark) {
        // 30% from the assignment mark and 70% from the exam paper mark[span_0](start_span)[span_0](end_span)
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // b) Method to determine the grade based on the final mark[span_1](start_span)[span_1](end_span)
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // c) Method to print the Name, Final Mark, and Grade of a student[span_2](start_span)[span_2](end_span)
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-12.2f %-5c\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print header matching the expected output format[span_3](start_span)[span_3](end_span)
        System.out.printf("%-15s %-12s %-5s\n", "Name", "Final Mark", "Grade");
        System.out.println("----------------------------------------");

        // d) Loop to get input for 5 students from the keyboard[span_4](start_span)[span_4](end_span)
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nEnter details for Student " + i + ":");
            
            System.out.print("Enter Name: ");
            String name = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100): ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100): ");
            double examMark = scanner.nextDouble();

            // Calculate final mark and find grade using the specified methods[span_5](start_span)[span_5](end_span)[span_6](start_span)[span_6](end_span)
            double finalMark = calcFinalMark(assignmentMark, examMark);
            char grade = findGrades(finalMark);

            // Print student details using printDetails method[span_7](start_span)[span_7](end_span)[span_8](start_span)[span_8](end_span)
            printDetails(name, finalMark, grade);
        }

        scanner.close();
    }
}