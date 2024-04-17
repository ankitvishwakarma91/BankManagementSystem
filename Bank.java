package BankManagementSystem.main.src;


import java.util.Random;

class BankManagement {
    String name;
    int balance;
    int accountNumber;

    public BankManagement(String name) {
        this.name = name;
        balance = 0;
        accountNumber = getAccountNumber();
    }

    public int getAccountNumber() {
        Random rand = new Random();
        int min = 10000;
        int max = 99999;
        return rand.nextInt((max - min) + 1) + min;
    }

    public void customerDetails() {
        System.out.println("Customer details");
        System.out.println("Name: " + name);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void creditAmount(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Your bank account credited amount is: " + amount);
            System.out.println("Your bank account balance is: " + balance);
        }else {
            System.out.println("Invalid amount you tried to credit");
        }
    }

    public void debitAmount(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Your bank account debited amount is: " + amount);
            System.out.println("Your bank account balance is: " + balance);
        } else {
            System.out.println("Insufficient balance to debit " + amount);
        }
    }

    public void totalAmount() {
        System.out.println("Your bank account total amount is: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankManagement account = new BankManagement("Account");
        account.customerDetails();
        account.creditAmount(100000);
        account.debitAmount(1560);
        account.totalAmount();
    }
}
