package Opgave5_KonsolProgram;

import java.util.ArrayList;

public class MessageApp {

    private ArrayList<String> messages;

    public MessageApp() {
        messages = new ArrayList<>();
    }

    public void add(String message) {
        messages.add(message);
        System.out.println("Message er gemt");
    }

    public void remove(int input) {
        // Hvis brugerens indeks er for stort, vises en fejl.
        if (input >= messages.size()) {
            System.out.println("Der er ikke besked number");
        } else {
            messages.remove(input);
            System.out.println("Message er fjernet");
        }

    }

    public void listAllMessages() {
        System.out.println("=======================");
        int i = 0;   // counter pattern
        for (String msg : messages) {
            System.out.println(i + ". " + msg);
            i++;
        }
        System.out.println("=======================");
    }

    public ArrayList<String> getMessages() {
        return messages;
    }
}
