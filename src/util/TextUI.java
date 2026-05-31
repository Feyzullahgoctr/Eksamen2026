package util;

import Opgave1.BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {

    private static Scanner sc = new Scanner(System.in);

    public static void displayMsg(String msg){
        System.out.println(msg);
    }


    // For Opgave 5
    public static int promptNumeric(String msg) {
        displayMsg(msg);
        try {
            String input = sc.nextLine();
            int numInput = Integer.parseInt(input);
            return numInput;
        } catch (NumberFormatException e) {
            System.out.println("Please enter a numeric value");
            return promptNumeric(msg);  // Rekursivt kald
        }
    }

    public static String promptText(String msg){
        displayMsg(msg);
        String input = sc.nextLine();

        return input;
    }

    public static double promptDouble(String msg) {
        displayMsg(msg);
        try {
            String input = sc.nextLine();
            double dobInput = Double.parseDouble(input);
            return dobInput;
        } catch (NumberFormatException e) {
            System.out.println("Please enter a double value");
            return promptDouble(msg);  // Rekursivt kald
        }
    }


    // for Opgave 1
    public static int promptUser(String msg, ArrayList<BankAccount> users) {
        displayMsg(msg);
        try {
            String input = sc.nextLine();
            int numInput = Integer.parseInt(input);

            if (numInput >= users.size()) {
                System.out.println("Der er ikke gyldig user");
                return promptUser(msg,users);
            }

            return numInput;
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid numeric value");
            return promptUser(msg,users);  // Rekursivt kald
        }
    }


}
