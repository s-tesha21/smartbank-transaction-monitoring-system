package model;
import java.util.ArrayList;

public class Account {

    private ArrayList<String> transactionHistory;
    private int accountNumber;
    private double balance;
    private Customer customer;

    // Constructor
public Account(int accountNumber, Customer customer) {
    this.accountNumber = accountNumber;
    this.customer = customer;
    this.balance = 0.0;
    this.transactionHistory = new ArrayList<>();
}
    // Deposit method
    public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        transactionHistory.add("Deposited: " + amount);
        System.out.println(amount + " deposited successfully.");
    } else {
        System.out.println("Invalid deposit amount.");
    }
}   
    // Withdraw method
    public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        transactionHistory.add("Withdrawn: " + amount);
        System.out.println(amount + " withdrawn successfully.");
    } else {
        System.out.println("Insufficient balance or invalid amount.");
    }
}
public void printTransactionHistory() {
    System.out.println("\nTransaction History:");
    for (String transaction : transactionHistory) {
        System.out.println(transaction);
    }
}

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Get customer
    public Customer getCustomer() {
        return customer;
    }
}
    

