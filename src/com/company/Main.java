package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        chooseLanguage();
        enterPin();
        chooseAccount();
        menuFunctions();
        receiptOptions();
    }

    public static void chooseLanguage() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select language (1-LV; 2-ENG; 3-RUS)");
        int language = input.nextInt();
        switch (language) {
            case 1:
                System.out.println("Valoda izvēlēta!\n");
                break;
            case 2:
                System.out.println("Language chosen!\n");
                break;
            case 3:
                System.out.println("язик выбран!");
                break;
        }
    }

    public static void receiptOptions() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Would You like to receive a receipt? \n" +
                " y - yes, to receive it!\n" +
                " n - no, save the paper!\n");

        char receiptOption = input.next().charAt(0);

        switch (receiptOption) {
            case 'y':
                System.out.println("printing the receipt! Don't forget to take Your card! \n" +
                        " Have a nice day!");
                break;
            case 'n':
                System.out.println("no receipt to print! Please take your credit card! \n" +
                        " Have a nice day!");
                break;

            default:
                System.out.println("Wrong entry!");
        }
    }

    public static void enterPin() {
        Scanner scanner = new Scanner(System.in);
        int pin = 1234;
        int tries = 0;
        int entry;
        while (true) {
            System.out.println("ENTER YOUR PIN: ");
            entry = scanner.nextInt();

            if (entry == pin) {
                System.out.println("PIN ACCEPTED. ACCESS GRANTED. \n");
                break;
            } else if (tries >= 2) {
                System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED. \n");
                System.exit(0);
                break;
            }
            tries++;
        }
    }

    public static void menuFunctions() {
        System.out.println("Choose a function");
        System.out.println("Check balance (b)");
        System.out.println("Withdraw (w)");
        System.out.println("Cash withdraw in USD ($)");
        System.out.println("Deposit (d)");
        Scanner option = new Scanner(System.in);
        char function = option.next().charAt(0);
        switch (function) {
            case 'b':
                Random random = new Random();
                int balance = random.nextInt(10000);
                System.out.println("Your balance is " + balance + " EUR");
                break;
            case 'w':
                Random random2 = new Random();
                int balance1 = random2.nextInt(10000);
                System.out.println("Your balance is " + balance1 + " EUR");
                System.out.println("Please enter the amount you would like to withdraw");
                Scanner withdraw = new Scanner(System.in);
                int balance2 = withdraw.nextInt();
                if (balance1 < balance2) {
                    System.out.println("Not sufficient funds to withdraw that amount");
                } else {
                    System.out.println("Your new balance is " + (balance1 - balance2) + " EUR");
                }
                break;
            case 'd':
                Random random3 = new Random();
                int balance3 = random3.nextInt(10000);
                System.out.println("Your current balance is " + balance3 + " EUR");
                System.out.println("Please enter the amount you would like to withdraw");
                Scanner cash = new Scanner(System.in);
                int deposit = cash.nextInt();
                System.out.println("Your new balance is " + (balance3 + deposit) + " EUR");
                break;
            case '$':
                Random random4 = new Random();
                int balance5 = random4.nextInt(10000);
                System.out.println("Please enter an amount you want to withdraw in USD (5, 10, 50 USD available)");
                Scanner withdraw2 = new Scanner(System.in);
                int balance4 = withdraw2.nextInt();
                double newbalance = (balance5 - balance4*1.16);
                if (balance5 < balance4) {
                    System.out.println("No sufficient funds");
                } else {
                    System.out.println(" " + (balance4*1.16) + " Eur has been withdrawn in USD currency. \n" +
                            "Your new balance is " + newbalance + "Euro");
                }
                break;
            default:
                System.out.println("Invalid function. Please try another option");
                break;
        }
    }

    public static void chooseAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose which account You would like to perform the following actions to: \n (1-primary account; 2-savings; 3-other)");
        int account = input.nextInt();
        switch (account) {
            case 1:
                System.out.println("Primary account LV0474XX1231354456 chosen \n");
                break;
            case 2:
                System.out.println("Savings account LV0474XX1231354456S chosen \n");
                break;
            case 3:
                System.out.println("Other account LV0474XX1231354456S chosen \n");
                break;
        }
    }
}