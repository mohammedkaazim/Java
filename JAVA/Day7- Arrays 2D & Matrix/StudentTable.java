import java.util.Scanner;

public class StudentTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[][] marks = new int[students][subjects];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Display student total & average
        for (int i = 0; i < students; i++) {
            int total = 0;
            for (int j = 0; j < subjects; j++) {
                total += marks[i][j];
            }
            double avg = (double) total / subjects;
            System.out.println("Student " + (i + 1) + " => Total: " + total + ", Average: " + avg);
        }
    }
}
