package Opgave5_KonsolProgram;

import util.TextUI;

public class KonsolManagement {

    private MessageApp messageApp;

    public void initialize() {
        messageApp = new MessageApp();
    }

    public void start() {

        boolean flag = true;
        while (flag){
            int input = TextUI.promptNumeric("1. Indtast besked \n2. Vis alle beskeder \n3. Fjern besked \n4. Afslut ");

            switch (input) {
                case 1:
                    String stringInput = TextUI.promptText("Besked : ");
                    messageApp.add(stringInput);
                    break;
                case 2:
                    messageApp.listAllMessages();
                    break;
                case 3:
                    // Hvis der ikke er nogen besked, vises en fejl.
                    if (messageApp.getMessages().isEmpty()) {
                        System.out.println("Der er ikke message");
                        System.out.println("========================");
                    } else {
                        messageApp.listAllMessages();
                        int beskedInput = TextUI.promptNumeric("Enter besked number");
                        messageApp.remove(beskedInput);

                    }
                    break;
                case 4:
                    flag = false;   // sentinel value
                    break;
                default:
                    break;

            }
        }

    }

}
