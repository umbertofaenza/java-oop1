package org.learning.javaoop1.javabank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        //initialise scanner
        Scanner scan = new Scanner(System.in);

        //welcome message & ask for name
        System.out.println("Welcome. Create your bank account.");
        System.out.print("Insert your name: ");
        String accHolder = scan.nextLine();

        //new instance of bank account
        BankAccount bAcc = new BankAccount(accHolder);

        //print new account's name, number and balance
        System.out.println("Here are your new account details: ");
        System.out.println("Account Holder: " + bAcc.getAccHolder());
        System.out.println("Account Number: " + bAcc.getAccNumber());
        System.out.println("Balance: " + String.format("%.2f", bAcc.getAccBalance()));

        //ask for next step until exit
        boolean sessionActive = true;

        do {
            System.out.print("What would you like to do? Write 'deposit', 'withdraw', or 'exit': ");
            String action = scan.nextLine().trim();

            //wrong input
            if (!action.equalsIgnoreCase("deposit") &&
                    !action.equalsIgnoreCase("withdraw") &&
                    !action.equalsIgnoreCase("exit")) {
                System.out.println("Wrong input entered.");
            }

            //deposit
            if (action.equalsIgnoreCase("deposit")) {
                System.out.println("How much would you like to deposit?");
                int amount = Integer.parseInt(scan.nextLine());
                bAcc.deposit(amount);

                System.out.println("Your new balance is: " + String.format("%.2f", bAcc.getAccBalance()));
            }

            //withdraw
            if (action.equalsIgnoreCase("withdraw") && (bAcc.getAccBalance() > 0)) {
                System.out.println("How much would you like to withdraw?");
                int amount = Integer.parseInt(scan.nextLine());

                //balance <= 0
                if (bAcc.getAccBalance() <= 0) {
                    System.out.println("You don't have enough funds.");
                }

                //withdraw under 0
                if (bAcc.getAccBalance() - amount >= 0) {
                    bAcc.withdraw(amount);
                    System.out.println("Your new balance is: " + String.format("%.2f", bAcc.getAccBalance()));
                } else {
                    System.out.println("You don't have enough funds.");
                }
            }

            //exit
            if (action.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for using our services.");
                sessionActive = false;
            }
        } while (sessionActive);

        scan.close();
    }
}
