package Opgave2_ArrayList;

import util.TextUI;

public class PhoneManagement {

    private PhoneBook phoneBook;

    public void creating() {
        Contact c1 = new Contact("Feyzullah", "53782415");
        Contact c2 = new Contact("Poyraz", "53782416");
        Contact c3 = new Contact("Sercan", "53782417");

        phoneBook = new PhoneBook();
        phoneBook.add(c1);
        phoneBook.add(c2);
        phoneBook.add(c3);
    }

    public void showMenu() {

        phoneBook.printPhoneBook();

        String input = TextUI.promptText("Indtast Navn :");
        Contact contact = phoneBook.findByName(input);

        if (contact == null) {
            System.out.println(input + ", kontakt ikke fundet.");
            System.out.println("=========================");
        } else {
            System.out.println(contact);
            System.out.println("=========================");

            int menuInput = TextUI.promptNumeric("1. Ændre PhoneNummer \n2. Exit");

            switch (menuInput) {
                case 1:
                    String newPhoneNummer = TextUI.promptText("Enter new phone nummer :");
                    phoneBook.chanceContact(contact, newPhoneNummer);
                    phoneBook.printPhoneBook();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    showMenu();
                    break;
            }

        }

    }


}

