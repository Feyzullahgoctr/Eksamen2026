package Opgave1;

import util.TextUI;

import java.util.ArrayList;

public class BankManagement {

    private ArrayList<BankAccount> users;

    public void initialize() {
        users = new ArrayList<>();
        users.add(new BankAccount("Feyzullah", 1500));
        users.add(new BankAccount("Sercan", 2000));
        users.add(new BankAccount("Ali", 3000));
        users.add(new BankAccount("Poyraz", 5000));

    }

    public void start() {

        boolean flag = true;
        while (flag) {

            printUsers();

            int userInput = TextUI.promptUser("Enter User : ", users);
            BankAccount user = users.get(userInput);

            int menuInput = TextUI.promptNumeric("1. Deposit \n2. With Draw \n3. Transfer \n4. Exit");

            double amount = 0;
            switch (menuInput) {
                case 1 :
                    amount = TextUI.promptDouble("Enter Amount");
                    user.deposit(amount);
                    break;
                case 2:
                    amount = TextUI.promptDouble("Enter Amount");
                    user.withdraw(amount);
                    break;
                case 3:
                    int secondUserInput = TextUI.promptUser("Enter Second User : ", users);
                    amount = TextUI.promptDouble("Enter Amount");

                    BankAccount secondUser  = users.get(secondUserInput);
                    user.transfer(secondUser,amount);

                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Der er ikke menuID");
                    System.out.println("=========================");
                    start();
                    break;
            }

        }


    }

    public void printUsers() {
        System.out.println("==== USER ====");
        int i = 0;
        for (BankAccount user : users) {
            System.out.println(i + ". " + user);
            i++;
        }
    }



}
