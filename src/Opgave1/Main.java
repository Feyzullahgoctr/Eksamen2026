package Opgave1;

public class Main {

    public static void main(String[] args) {


       /* BankAccount firsteCustomer = new BankAccount("Feyzullah", 1500);
        BankAccount secondCustomer = new BankAccount("Sercan", 2000);

        System.out.println(firsteCustomer);
        System.out.println(secondCustomer);

        System.out.println("==================================");

        // depositum
        firsteCustomer.deposit(500);
        secondCustomer.deposit(-500);  // fejl

        System.out.println("==================================");

        // withdraw
        firsteCustomer.withdraw(-500); // fejl
        secondCustomer.withdraw(1000);
        secondCustomer.withdraw(5000); // fejl

        System.out.println("==================================");

        // transfer
        firsteCustomer.transfer(secondCustomer, 300);
        secondCustomer.transfer(firsteCustomer, 5000); // Fejl

        System.out.println("==================================");

        // vises igen
        System.out.println(firsteCustomer);
        System.out.println(secondCustomer);*/


        BankManagement bankManagement = new BankManagement();
        bankManagement.initialize();
        bankManagement.start();
        bankManagement.printUsers();


    }




}
