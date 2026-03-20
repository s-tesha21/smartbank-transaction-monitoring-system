package main;

import model.Customer;
import model.Account;

public class MainApp {

    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Rahul", "rahul@email.com");

        Account account1 = new Account(101, customer1);

        account1.deposit(5000);
        account1.withdraw(2000);

        System.out.println("Final Balance: " + account1.getBalance());
    }
}