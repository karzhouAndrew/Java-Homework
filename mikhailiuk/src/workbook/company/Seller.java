package workbook.company;

/**
 * Created by Natashka on 25.02.2015.
 */
public class Seller extends Employee {
    private int level;

    public Seller(int level) {
        this.level = level;
    }

    public Seller() {
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void recruit(Employee employee) {
        return;
    }

    @Override
    public void fire(Employee employee) {
        return;
    }
}
