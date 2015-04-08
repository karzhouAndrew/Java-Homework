package classes.lab11;

public class Tree extends Plant {

    private double trunk;
    private static final double heightRatePerYear = 0.9;
    private static final double trunkRatePerYear = 0.4;

    public void setTrunk(double trunk) {
        this.trunk = trunk;
    }

    public Tree() {
    }

    public double getTrunk() {
        return trunk;
    }

    public static double getHeightRatePerYear() {
        return heightRatePerYear;
    }

    public static double getTrunkRatePerYear() {
        return trunkRatePerYear;
    }

    @Override
    public void grow() {
        double heightRate = SaxParserExample.getGrowthPeriod() * Tree.getHeightRatePerYear();
        double newHeight = this.getHeight() + heightRate;
        this.setHeight(newHeight);
        double newAge = this.getAge() + SaxParserExample.getGrowthPeriod();
        this.setAge(newAge);
        double trunkRate = Tree.getTrunkRatePerYear() * SaxParserExample.getGrowthPeriod();
        double newTrunk = this.getTrunk() + trunkRate;
        this.setTrunk(newTrunk);
    }

    @Override
    public String toString() {
        return "Tree{" + super.toString() +
                " trunk=" + trunk +
                '}';
    }
}
