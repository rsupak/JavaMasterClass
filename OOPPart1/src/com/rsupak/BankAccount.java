package com.rsupak;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public BankAccount() {
        this(
                "56789",
                2.50,
                "Default Name",
                "Default Address",
                "Default Phone"
        );
    }

    public void depositFunds(double funds) {
        balance += funds;
        System.out.println("Deposit processed");
        System.out.println("Current balance: $ " + balance);
    }

    public void withdrawFunds(double funds) {
        if (balance >= funds) {
            balance -= funds;
            System.out.println("$ " + funds + " withdrawn.");
        } else {
            System.out.println("Invalid transaction. Insufficient funds.");
        }
        System.out.println("Current balance: $ " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
