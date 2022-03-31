package com.bridgelabz.oops.account;

import java.util.Scanner;

public class Account
{
    private String accNo;
    private String name;
    private long balance;

    Scanner sc = new Scanner(System.in);
    void openAccount() {
        System.out.print("Enter Account No: ");
        accNo = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }
    void showAccount() {
        System.out.println(accNo + " " + name + " " + balance);
    }

    void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit : ");
        amt = sc.nextLong();
        balance = balance + amt;
    }

    void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw : ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Debit amount exceeded account balance. Transaction failed.");
        }
    }

    boolean search(String acn) {
        if (accNo.equals(acn)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}
