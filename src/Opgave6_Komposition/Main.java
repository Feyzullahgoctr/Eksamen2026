package Opgave6_Komposition;

public class Main {

    public static void main() {

        Car car = new Car("BMV", new Engine());
        car.start();
        car.stop();

        System.out.println("===========================");
        car.start();
        car.start();

        System.out.println("===========================");
        car.stop();
        car.stop();

    }

}
