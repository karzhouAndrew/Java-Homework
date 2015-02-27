package workbook.company;

/**
 * Created by Natashka on 25.02.2015.
 */
public class Developer extends Employee {
    private String technology;

    public Developer(String technology) {
        this.technology = technology;
    }

    public Developer() {
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
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
