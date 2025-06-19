import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your note:");
        String note = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("mynotes.txt", true);
            fw.write(note + "\n");
            fw.close();
            System.out.println("Note saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving note: " + e.getMessage());
        }
    }
}
