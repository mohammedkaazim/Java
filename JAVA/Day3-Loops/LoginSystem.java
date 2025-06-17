import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "admin";
        String password = "1234";
        int attempts = 0;

        while (attempts < 3){
            System.out.println("Enter username: ");
            String user = sc.next();
            System.out.println("Enter password: ");
            String pass = sc.next();

            if (user.equals(username) && pass.equals(password)){
                System.out.println("login successful");
                break;
            }else {
                System.out.println("Invalid credentials. Try again.");
                attempts++;
            }
        }
        if (attempts == 3){
            System.out.println("Account locked. Too many attempts.");
        }
    }
}