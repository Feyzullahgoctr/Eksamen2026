package Opgave2_ArrayList;

import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void add(Contact c) {
        contacts.add(c);
    }

    public Contact findByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public void chanceContact(Contact c, String newPhoneNummer) {
        if (contacts.contains(c)) {
            c.setPhoneNumber(newPhoneNummer);
        }
    }

    public void printPhoneBook() {
        System.out.println("=========================");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
        System.out.println("=========================");
    }

}
