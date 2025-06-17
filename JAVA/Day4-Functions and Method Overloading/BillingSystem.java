import java.util,Scanner;

public class BillingSystem {
    public static double applyGST(double amount, double discountPercent) {
        return amount + (amount * 0.18); // 18% GST
    }

    public static double applyDiscount(double amount, double discountPercent) {
        return amount - (amount * discountPercent / 100.0); // Apply discount
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product amount: ");
        double amount = sc.nextDouble();

        double priceAfterGST = applyGST(amount);
        System.out.println("Price after GST: " + priceAfterGST);

        System.out.print("Enter the discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discountedPrice = applyDiscount(priceAfterGST, discountPercent);
        System.out.println("Discounted price: " + discountedPrice);
    }
}