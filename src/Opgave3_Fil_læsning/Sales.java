package Opgave3_Fil_læsning;

public class Sales {

    private int month;
    private int salesvalue;

    public Sales(int month, int salesvalue) {
        this.month = month;
        this.salesvalue = salesvalue;
    }

    public int getMonth() {
        return month;
    }

    public int getSalesvalue() {
        return salesvalue;
    }

    public void setSalesvalue(int salesvalue) {
        if (salesvalue >= 0) {
            this.salesvalue = salesvalue;
        } else {
            System.out.println("Sales værdi skal være større end 0");
        }

    }

    @Override
    public String toString() {
        return month +
                ", " + salesvalue;
    }
}
