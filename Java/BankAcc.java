package mb;
class BankAccount {
    protected double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: RS " + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: RS " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Cannot withdraw: Balance would fall below RS:100");
        } else {
            super.withdraw(amount); 
        }
    }
}
public class BankAcc {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        account.deposit(200);
        account.withdraw(300);  
        System.out.println("BankAccount Balance: " + account.getBalance());
        SavingsAccount savings = new SavingsAccount(500);
        savings.deposit(200);
        savings.withdraw(650);
        savings.withdraw(500);
        System.out.println("SavingsAccount Balance: RS:" + savings.getBalance());
    }
}
