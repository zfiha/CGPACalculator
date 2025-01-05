import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

               System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Course " + i + ":");

                       System.out.print("Enter course credit (Max 3): ");
            int credit = scanner.nextInt();

                     System.out.print("Enter CT marks (Max 30): ");
            int ctMarks = scanner.nextInt();

            System.out.print("Enter AT marks (Max 10): ");
            int atMarks = scanner.nextInt();

            System.out.print("Enter FE marks (Max 60): ");
            int feMarks = scanner.nextInt();

                        int totalMarks = ctMarks + atMarks + feMarks;
            double gradePoint = calculateGradePoint(totalMarks);

                        totalCredits += credit;
            totalGradePoints += gradePoint * credit;
        }

                double cgpa = totalGradePoints / totalCredits;

                String grade = calculateGrade(cgpa);

               System.out.println("\nStudent ID: " + studentID);
        System.out.println("Credit Taken: " + (int) totalCredits);
        System.out.println("Credit Earned: " + (int) totalCredits);         System.out.printf("CGPA: %.2f%n", cgpa);
        System.out.println("Grade: " + grade);
    }

      private static double calculateGradePoint(int marks) {
        if (marks >= 90) return 4.0;
        else if (marks >= 80) return 3.7;
        else if (marks >= 70) return 3.5;
        else if (marks >= 60) return 3.0;
        else if (marks >= 50) return 2.5;
        else return 0.0;     }

        private static String calculateGrade(double cgpa) {
        if (cgpa >= 3.7) return "A";
        else if (cgpa >= 3.5) return "A-";
        else if (cgpa >= 3.0) return "B";
        else if (cgpa >= 2.5) return "C";
        else return "F";
    }
}