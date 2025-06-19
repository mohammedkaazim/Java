import java.util.*;

class Student {
    String name;
    int age;
    String course;

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println(name + " | Age: " + age + " | Course: " + course);
    }
}

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add  2. View  3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Course: ");
                String course = sc.nextLine();

                students.add(new Student(name, age, course));
                System.out.println("✔ Student added");
            } else if (choice == 2) {
                for (Student s : students) s.display();
            } else break;
        }
    }
}
