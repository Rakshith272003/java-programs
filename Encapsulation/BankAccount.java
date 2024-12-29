package Encapsulation;

public class BankAccount {
    private double balance;//private field called balance

    public BankAccount(double initalBalance){
        if (initalBalance>=0){
            this.balance=initalBalance;
        }
        else{
            System.out.println("Invaild inital Balance");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if(balance >=0 ){
            this.balance=balance;
        }
        else {
            System.out.println("Balance cannot be negative.");
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}


