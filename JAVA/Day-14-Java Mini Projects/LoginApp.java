import java.util.HashMap;
import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("admin", "admin123");
        users.put("kaazim", "pass123");

        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        if (users.containsKey(user) && users.get(user).equals(pass)) {
            System.out.println("✅ Login successful!");
        } else {
            System.out.println("❌ Invalid credentials.");
        }
    }
}
