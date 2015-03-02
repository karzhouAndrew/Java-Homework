package workbook.lab24;

import java.util.Random;

public class Refrigerator extends Technique {
    private String refrigeratorModel;

    public Refrigerator() {
        refrigeratorModel = generateRefrigeratorModel();
        System.out.println(this);
    }

    public String generateRefrigeratorModel() {
        Random random = new Random();
        return RefrigeratorModels.values()[random.nextInt(RefrigeratorModels.values().length)].toString();
    }

    public String getRefrigeratorModel() {
        return refrigeratorModel;
    }

    @Override
    public String toString() {
        return "Refrigerator " +
                super.toString() +
                " refrigeratorModel = " + refrigeratorModel;
    }
}
