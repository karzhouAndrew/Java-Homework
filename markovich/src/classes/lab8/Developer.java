package classes.lab8;

import java.util.Random;

public class Developer extends Person {

    private String technology;

    public Developer() {
        technology = generateTechnology();
        System.out.println(this);
    }

    public String generateTechnology() {
        Random random = new Random();
        return Technology.values()[random.nextInt(Technology.values().length)].toString();
    }

    @Override
    public String toString() {
        return "Developer " +
                "technology = " + technology +
                ", " + super.toString();
    }
}
