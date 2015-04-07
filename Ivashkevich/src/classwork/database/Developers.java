package classwork.database;

/**
 * Created by Leonid on 27.02.2015.
 */
public class Developers extends Employee {
    private String technologyUsed;

    public void jobTitle() {
        System.out.println("\nПрограммист");
    }

    public Developers() {
        setTechnologyUsed();
    }

    public String getTechnologyUsed() {
        return technologyUsed;
    }

    public void setTechnologyUsed() {
        technologyUsed = Technology.values()[(int) (Math.random() * Technology.values().length)].toString();
        System.out.println("Технология: " + technologyUsed);
        this.technologyUsed = technologyUsed;
    }
}
