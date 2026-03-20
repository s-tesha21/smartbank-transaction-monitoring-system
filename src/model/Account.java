package model;

public class Account {

    private int accountNumber;
    private double balance;
    private Customer customer;

    // Constructor
    public Account(int accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0.0;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }   
    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
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
    

