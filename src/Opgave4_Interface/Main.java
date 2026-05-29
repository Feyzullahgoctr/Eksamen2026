package Opgave4_Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Notifier> notifiers = new ArrayList<>();

        notifiers.add(new EmailNotifier("Feyzullah"));
        notifiers.add(new SmsNotifier());
        notifiers.add(new SlackNotifier("DR2"));
        notifyAll(notifiers,"Dette projekt blev lavet med Java");

    }

    private static void notifyAll(List<Notifier> notifiers, String message) {
        for (Notifier notifier : notifiers) {
            notifier.send(message);  // dynamic binding

        }
    }


}
