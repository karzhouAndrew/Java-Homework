package classes.lab11;

public class Shrub extends Plant {

    private boolean berries;
    private String flowers;
    private static final double heightRatePerYear = 0.2;

    public Shrub(String name, double age, double height) {
        super(name, age, height);
    }

    public Shrub(String name, double age, double height, boolean berries, String flowers) {
        super(name, age, height);
        this.berries = berries;
        this.flowers = flowers;
    }

    public boolean isBerries() {
        return berries;
    }

    public String getFlowers() {
        return flowers;
    }

    public static double getHeightRatePerYear() {
        return heightRatePerYear;
    }

    @Override
    public void grow() {
        double heightRate = SaxParserExample.getGrowthPeriod() * Shrub.getHeightRatePerYear();
        double newHeight = this.getHeight() + heightRate;
        this.setHeight(newHeight);
        double newAge = this.getAge() + SaxParserExample.getGrowthPeriod();
        this.setAge(newAge);
    }

    @Override
    public String toString() {
        return "Shrub{" + super.toString() +
                " berries=" + berries +
                ", flowers='" + flowers + '\'' +
                '}';
    }
}
