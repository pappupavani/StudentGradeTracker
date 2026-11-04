import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] rollNumbers = new int[n];
        double[] marks = new double[n];

        double total = 0;
        double highest = 0;
        double lowest = 100;

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Student " + (i + 1) + " Details");

            System.out.print("Enter Student Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            rollNumbers[i] = sc.nextInt();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextDouble();
            sc.nextLine();

            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = total / n;

        System.out.println("\n===== Student Summary Report =====");

        for (int i = 0; i < n; i++) {

            String grade;

            if (marks[i] >= 90) {
                grade = "A";
            } else if (marks[i] >= 75) {
                grade = "B";
            } else if (marks[i] >= 60) {
                grade = "C";
            } else if (marks[i] >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("\nStudent Name: " + names[i]);
            System.out.println("Roll Number: " + rollNumbers[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println("Grade: " + grade);
        }

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}