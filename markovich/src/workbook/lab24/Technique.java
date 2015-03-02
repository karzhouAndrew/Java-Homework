package workbook.lab24;

import java.util.Random;

public class Technique {
    private String brandName;
    private boolean plugged;

    public Technique() {
        brandName = generateBrandName();
    }

    public boolean includingTechnicians() {
        this.plugged = true;
        System.out.println(this + " - power is ON");
        return plugged;
    }

    public String generateBrandName() {
        Random random = new Random();
        return BrandNames.values()[random.nextInt(BrandNames.values().length)].toString();
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public String toString() {
        return "brandName = " + brandName
                + " plugged = " + plugged;
    }
}
