import java.util.Scanner;

public class ChatFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your message:");
        String msg = sc.nextLine().toLowerCase();

        if (msg.contains("fuck") || msg.contains("shit")) {
            System.out.println("⚠️ Message contains bad words. Not allowed!");
        } else {
            System.out.println("✅ Message sent: " + msg);
        }
    }
}
