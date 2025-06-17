import java.util.Sanner;

public class Factorial {
    public static int findFactorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + findFactorial(num));
    }
}