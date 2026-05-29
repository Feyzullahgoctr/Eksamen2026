package Opgave6_Komposition;

import util.TextUI;

public class Management {

    private Car car;

    public void initialize() {
        car = new Car("BMV", new Engine());
    }

    public void showMenu() {

        boolean flag = true;
        while (flag) {

            System.out.println("==========================");
            int input = TextUI.promptNumeric("1.Start bilen \n2.Stop bilen \n3.Afslut");

            switch (input) {
                case 1:
                    car.start();
                    break;
                case 2:
                    car.stop();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Ugyldig MenuID");
                    showMenu();
                    break;
            }

        }
    }

}
