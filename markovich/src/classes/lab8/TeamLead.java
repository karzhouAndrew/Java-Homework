package classes.lab8;

public class TeamLead extends Person {
    public TeamLead() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "TeamLead " + super.toString();
    }
}
