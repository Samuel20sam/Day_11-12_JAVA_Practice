package com.bridgelabz.oops.account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of accounts to create");
        int n = sc.nextInt();
        Account[] account = new Account[n];

        for (int i = 0; i < account.length; i++) {
            account[i] = new Account();
            account[i].openAccount();

            int option;
            String accountNumber = sc.next();
            boolean found = false;

            System.out.println("""
                    Select option:
                    1. Display All
                    2. Search by Account
                    3. Deposit
                    4. Withdrawal
                    5. Exit""");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    for (Account element : account) {
                        element.showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter the account number ");
                    for (Account item : account) {
                        found = item.search(accountNumber);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account does not exist");
                    }
                    break;
                case 3:
                    System.out.print("Enter the account number ");
                    accountNumber = sc.next();
                    for (Account item : account) {
                        found = item.search(accountNumber);
                        if (found) {
                            item.deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account does not exist");
                    }
                    break;
                case 4:
                    System.out.print("Enter the account number ");
                    accountNumber = sc.next();
                    for (Account item : account) {
                        found = item.search(accountNumber);
                        if (found) {
                            item.withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account does not exist");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Choose a valid option");
            }
        }
    }
}