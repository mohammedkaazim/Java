import java.util.*;

public class BillApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Double> items = new LinkedHashMap<>();

        while (true) {
            System.out.print("Enter item name (or 'done'): ");
            String item = sc.nextLine();
            if (item.equalsIgnoreCase("done")) break;

            System.out.print("Enter price: ");
            double price = sc.nextDouble(); sc.nextLine();
            items.put(item, price);
        }

        double total = 0;
        System.out.println("\n🧾 Bill:");
        for (String key : items.keySet()) {
            System.out.println(key + " : ₹" + items.get(key));
            total += items.get(key);
        }

        System.out.println("Total = ₹" + total);
    }
}
