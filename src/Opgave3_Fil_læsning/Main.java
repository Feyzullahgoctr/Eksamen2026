package Opgave3_Fil_læsning;

public class Main {

    public static void main(String[] args) {

        SalesReader salesReader = new SalesReader("data/sales.csv");
        salesReader.readFile();
        System.out.println("Total : " + salesReader.total());
        System.out.println("Average : " + salesReader.average());
        System.out.println("Max : " + salesReader.max());


        // Write Test
        salesReader.getSalesValues().get(0).setSalesvalue(-500);
        salesReader.getSalesValues().get(0).setSalesvalue(43000);
        salesReader.writeFile();



    }

}
