package workbook.lab24;

import java.util.Random;

public class TV extends Technique {
    private String TVModel;

    public TV() {
        TVModel = generateTVModel();
        System.out.println(this);
    }

    public String generateTVModel() {
        Random random = new Random();
        return TVModels.values()[random.nextInt(TVModels.values().length)].toString();
    }

    public String getTVModel() {
        return TVModel;
    }

    @Override
    public String toString() {
        return "Refrigerator " +
                super.toString() +
                " refrigeratorModel = " + TVModel;
    }

}
