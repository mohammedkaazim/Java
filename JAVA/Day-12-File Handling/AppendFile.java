import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("notes.txt", true); // true = append
            writer.write("\nThis line was added later.");
            writer.close();
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending file: " + e.getMessage());
        }
    }
}
