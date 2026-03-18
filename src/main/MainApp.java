package main;

import model.Customer;

public class MainApp {

    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Rahul", "rahul@email.com");

        System.out.println("Customer ID: " + customer1.getCustomerId());
        System.out.println("Name: " + customer1.getName());
        System.out.println("Email: " + customer1.getEmail());
    }
}