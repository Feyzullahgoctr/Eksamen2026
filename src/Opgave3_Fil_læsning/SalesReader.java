package Opgave3_Fil_læsning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SalesReader {

    private String filePath;
    private ArrayList<Sales> salesValues;

    public SalesReader(String filePath) {
        this.filePath = filePath;
        salesValues = new ArrayList<>();
    }

    public void readFile() {

        try {
            File file = new File(filePath);
            Scanner scan = new Scanner(file);

            scan.nextLine();
            while (scan.hasNextLine()) {
                String[] data = scan.nextLine().split(",");
                int month = Integer.parseInt(data[0].trim());
                int salesValue = Integer.parseInt(data[1].trim());

                salesValues.add(new Sales(month, salesValue));

            }
            scan.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void writeFile() {

        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("måned, salgstal\n");

            for (Sales sale : salesValues) {
                fileWriter.write(sale.getMonth() + "," + sale.getSalesvalue()+"\n");
            }
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public int total() {

        int total = 0;   // accumulator pattern
        for (Sales sale : salesValues) {
            total += sale.getSalesvalue();
        }

        return total;
    }

    public double average() {
        double avg = (double) total() / salesValues.size();
        return Math.round(avg * 100.) / 100.;
    }

    public int max() {

        int max = salesValues.get(0).getSalesvalue();
        for (Sales sale : salesValues) {
            if (max < sale.getSalesvalue()) {
                max = sale.getSalesvalue();
            }
        }
        return max;
    }


    public ArrayList<Sales> getSalesValues() {
        return salesValues;
    }
}
