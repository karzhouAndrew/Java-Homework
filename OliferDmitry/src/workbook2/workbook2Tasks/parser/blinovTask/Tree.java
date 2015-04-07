package workbook2.workbook2Tasks.parser.blinovTask;

public class Tree extends Plant {

    public static final double growMetresPerYear = 1;

    public Tree(String name, double age, double height) {
        super(name, age, height);

    }

    public double getGrowMetresPerYear() {
        return growMetresPerYear;
    }

    @Override
    public String toString() {
        return "\nTree (" +
                "name=" + super.getName().toUpperCase() +
                ", age=" + super.getAge() +
                ", height=" + super.getHeight() +
                ")";
    }
}
