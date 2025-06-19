class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

public class BankApp {
    static void deposit(int amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than 0");
        }
        System.out.println("Deposited ₹" + amount);
    }

    public static void main(String[] args) {
        try {
            deposit(-500);
        } catch (InvalidAmountException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}
