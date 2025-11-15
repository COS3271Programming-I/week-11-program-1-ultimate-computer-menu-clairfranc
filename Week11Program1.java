package week11;

// Claire Francis, Week11Program1, 11/14/2025

import java.util.Scanner;

public class Week11Program1 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n====== ULTIMATE COMPUTER MENU ======");
            System.out.println("1) Display App");
            System.out.println("2) Text Art App");
            System.out.println("3) Calculator App");
           	System.out.println("4) Binary Calculator App");
            System.out.println("5) Encouragement App");
            System.out.println("6) Dice App");
            System.out.println("7) Oppish App");
            System.out.println("8) Fibonacci App");
            System.out.println("9) Double Factorial App");
            System.out.println("10) Exit");
            System.out.print("Select a task (1–10): ");

            while (!input.hasNextInt()) {
                System.out.print("Invalid entry. Please enter a number (1–10): ");
                input.next();
            }

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayApp();
                    break;
                case 2:
                    textArtApp();
                    break;
                case 3:
                    calculatorApp();
                    break;
                case 4:
                    binaryCalculatorApp();
                    break;
                case 5:
                    encouragementApp();
                    break;
                case 6:
                    diceApp();
                    break;
                case 7:
                    oppishApp();
                    break;
                case 8:
                    fibonacciApp();
                    break;
                case 9:
                    doubleFactorialApp();
                    break;
                case 10:
                    System.out.println("Exiting Ultimate Computer... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1–10.");
            }

        } while (choice != 10);

        input.close();
    }


    public static void displayApp() {
        // Fill in later
        System.out.println("[Display App called]");
    }

    public static void textArtApp() {
        // Fill in later
        System.out.println("[Text Art App called]");
    }

    public static void calculatorApp() {
        // Fill in later
        System.out.println("[Calculator App called]");
    }

    public static void binaryCalculatorApp() {
        // Fill in later
        System.out.println("[Binary Calculator App called]");
    }

    public static void encouragementApp() {
        // Fill in later
        System.out.println("[Encouragement App called]");
    }

    public static void diceApp() {
        // Fill in later
        System.out.println("[Dice App called]");
    }

    public static void oppishApp() {
        // Fill in later
        System.out.println("[Oppish App called]");
    }

    public static void fibonacciApp() {
        // Fill in later
        System.out.println("[Fibonacci App called]");
    }

    public static void doubleFactorialApp() {
        // Fill in later
        System.out.println("[Double Factorial App called]");
    }


	}


