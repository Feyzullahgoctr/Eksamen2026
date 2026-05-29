package Opgave4_Interface;

public class SlackNotifier implements Notifier {

    private String channel;

    public SlackNotifier(String channel) {
        this.channel = channel;
    }

    @Override
    public void send(String message) {
        System.out.println("Channel :" +  channel + ", " + message);
    }
}
