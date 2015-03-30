package classes.lab11;

public class Tree extends Plant {

    private double trunk;
    private static final double heightRatePerYear = 0.9;
    private static final double trunkRatePerYear = 0.4;

    public void setTrunk(double trunk) {
        this.trunk = trunk;
    }

    public Tree(String name, double age, double height) {
        super(name, age, height);
    }

    public Tree(String name, double age, double height, double trunk) {
        super(name, age, height);
        this.trunk = trunk;
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
    public String toString() {
        return "Tree{" + super.toString() +
                " trunk=" + trunk +
                '}';
    }
}
