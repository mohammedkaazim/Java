import java.io.*;
import java.util.Scanner;

public class NotesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your note: ");
        String note = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("notes.txt", true);
            fw.write(note + "\n");
            fw.close();
            System.out.println("✔ Note saved.");
        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
