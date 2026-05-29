package Opgave4_Interface;

public class EmailNotifier implements Notifier {

    private String recipient;

    public EmailNotifier(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public void send(String message) {
        System.out.println("Recipient : " +recipient + " , " + message);
    }
}
