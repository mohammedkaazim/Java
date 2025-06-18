class Account {
    String accHolder;
    double balance;

    Account(String accHolder, double balance) {
        this.accHolder = accHolder;
        this.balance = balance;
    }

    void display() {
        System.out.println(accHolder + "'s balance: ₹" + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String accHolder, double balance, double interestRate) {
        super(accHolder, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }
}

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("Kaazim", 10000, 5.5);
        s.display();
        s.addInterest();
        s.display();
    }
}
