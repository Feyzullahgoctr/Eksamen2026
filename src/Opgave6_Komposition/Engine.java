package Opgave6_Komposition;

public class Engine {


    private boolean running;

    public Engine() {
        running = false;
    }

    public void start() {
        if (isRunning()) {
            System.out.println("Bilen kører allerede");
        } else {
            running = true;
            System.out.println("Bilen blev startet");
        }

    }

    public void stop() {
        if (isRunning()) {
            running = false;
            System.out.println("Bilen blev stoppet");
        } else {
            System.out.println("Bilen kører ikke engang");
        }
    }

    private boolean isRunning() {
        return running;
    }
}
