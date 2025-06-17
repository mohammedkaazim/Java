import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num + (isPrime(num) ? " is a prime number." : " is not a prime number."));
    }
}