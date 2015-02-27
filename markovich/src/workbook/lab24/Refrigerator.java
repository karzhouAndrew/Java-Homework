package workbook.lab24;

import java.util.Random;

public class Refrigerator extends Technique {
    String refrigeratorModel;

    public Refrigerator() {
        refrigeratorModel = setRefrigeratorModel();
        System.out.println(this);
    }

    public String setRefrigeratorModel() {
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
