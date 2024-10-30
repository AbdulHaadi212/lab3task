package lab3;


import java.util.Scanner;

public class MarkSheet {

    public static double calculatePercentage(double obtainedMarks, double totalMarks) {
        return (obtainedMarks / totalMarks) * 100;
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static double calculateGPA(String grade) {
        switch (grade) {
            case "A+":
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0;
        }
    }

    public static void displayMarkSheet(String studentName, double totalMarks, double obtainedMarks) {
        double percentage = calculatePercentage(obtainedMarks, totalMarks);
        String grade = calculateGrade(percentage);
        double gpa = calculateGPA(grade);

        // Presenting the mark sheet
        System.out.println("\n--- Mark Sheet ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.printf("GPA: %.1f\n", gpa);
        System.out.println("-------------------\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Section
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Total Marks: ");
        double totalMarks = scanner.nextDouble();
        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = scanner.nextDouble();

        // Check for valid input
        if (obtainedMarks > totalMarks) {
            System.out.println("Obtained marks cannot be greater than total marks.");
            return;
        }

        // Output Section
        displayMarkSheet(studentName, totalMarks, obtainedMarks);

        scanner.close();
    }
}

