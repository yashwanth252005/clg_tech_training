package JavaTraining.module3;

//Create a class BankAccount with attributes accountNumber and balance, and methods deposit and withdraw. Use encapsulation.

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayInfo() {
        System.out.println("Account: " + accountNumber + " | Current Balance: " + balance);
    }
}

public class Question1 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("12345", 5000.0);

        myAccount.displayInfo();
        myAccount.deposit(1500.0);
        myAccount.withdraw(2000.0);

        System.out.println("Final Balance: " + myAccount.getBalance());
    }
}
