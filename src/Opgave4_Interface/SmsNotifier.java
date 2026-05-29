package Opgave4_Interface;

public class SmsNotifier implements Notifier {

    @Override  //
    public void send(String message) {
        if (message.length() > 160) {
            message = message.substring(0, 160);
        }
        System.out.println("Sms : " + message);
    }
}
