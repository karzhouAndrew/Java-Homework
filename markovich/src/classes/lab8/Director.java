package classes.lab8;

public class Director extends Person {
    public Director() {
        if (!directorExist) {
            System.out.println(this);
            directorExist = true;
        } else {
            System.out.println("The company already has a director!");

        }
    }

    @Override
    public String toString() {
        return "Director " + super.toString();
    }
}
