import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        phoneBook.put("Kaazim", "6382392099");
        phoneBook.put("Fouziya", "9876543210");

        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        if (phoneBook.containsKey(name)) {
            System.out.println("Number: " + phoneBook.get(name));
        } else {
            System.out.println("Name not found.");
        }
    }
}
