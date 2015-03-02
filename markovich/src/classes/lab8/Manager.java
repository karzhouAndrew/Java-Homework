package classes.lab8;

public class Manager extends Person {
    public Manager() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Manager " + super.toString();
    }
}
