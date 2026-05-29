package Opgave2_ArrayList;

import java.util.Objects;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid PhoneNummer");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public String toString() {
        return name +
                " : " + phoneNumber;
    }
}
