import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double average = (double) sum / n;
        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);

        // Grade check
        if (average >= 90) System.out.println("Grade: A+");
        else if (average >= 75) System.out.println("Grade: A");
        else if (average >= 60) System.out.println("Grade: B");
        else if (average >= 40) System.out.println("Grade: C");
        else System.out.println("Grade: Fail");
    }
}
