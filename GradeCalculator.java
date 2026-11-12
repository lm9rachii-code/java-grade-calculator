import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String again;

        do {

            System.out.println("=== STUDENT GRADE CALCULATOR ===");

            System.out.print("Enter student name: ");
            String name = scanner.next();

            double grade1;
            do {
                System.out.print("Enter the first grade (0-10): ");
                grade1 = scanner.nextDouble();
            } while (grade1 < 0 || grade1 > 10);

            double grade2;
            do {
                System.out.print("Enter the second grade (0-10): ");
                grade2 = scanner.nextDouble();
            } while (grade2 < 0 || grade2 > 10);

            double grade3;
            do {
                System.out.print("Enter the third grade (0-10): ");
                grade3 = scanner.nextDouble();
            } while (grade3 < 0 || grade3 > 10);

            double average = (grade1 + grade2 + grade3) / 3;

            double highest = Math.max(grade1, Math.max(grade2, grade3));
            double lowest = Math.min(grade1, Math.min(grade2, grade3));

            System.out.println("\nStudent: " + name);
            System.out.printf("Average: %.2f%n", average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);

            if (average >= 5) {
                System.out.println("Result: PASSED");
            } else {
                System.out.println("Result: FAILED");
            }

            System.out.print("\nCalculate another student? (yes/no): ");
            again = scanner.next();

        } while (again.equalsIgnoreCase("yes"));

        scanner.close();
    }
}