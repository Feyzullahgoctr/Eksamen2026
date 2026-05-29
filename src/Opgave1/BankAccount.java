package Opgave1;

public class BankAccount {

    //  et simpelt banksystem med konti der kan indsætte, hæve og overføre beløb

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (isAmountValid(amount)) {
            balance += amount;
            System.out.println(owner + ", indbetaling gennemført : " + amount);
        } else {
            System.out.println(owner + ", Ugyldig værdi : " + amount);
        }
    }

    public void withdraw(double amount) {

        if (isAmountAccepted(amount)) {
            balance -= amount;
            System.out.println(owner + ", Udbetaling gennemført : " + amount );
        } else {
            System.out.println(owner + ", Ugyldig værdi (Tjek venligst saldobeløbet) : " + amount);
        }
    }

    public void transfer(BankAccount target, double amount) {

        if (isAmountAccepted(amount)){
            withdraw(amount);
            target.deposit(amount);
            System.out.println( amount + " kr. blev overført fra bruger " + owner + " til bruger " + target.owner +"\n");
        }
    }

    private boolean isAmountValid(double amount) {
        return amount > 0;
    }

    private boolean isAmountAccepted(double amount) {
        return amount > 0 && amount <= balance;
    }


    @Override
    public String toString() {
        return owner +
                ", " + balance;
    }
}
