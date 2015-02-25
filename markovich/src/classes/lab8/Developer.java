package classes.lab8;

public class Developer extends Person {
    public Developer() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Developer " + super.toString();
    }
}
