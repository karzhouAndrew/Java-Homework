package classwork.class4;

/**
 * Created by Tonya on 24.02.2015.
 */
public class TeamLeader extends Employee {
    private int numberTeam;

    public TeamLeader(int numberTeam) {
        this.numberTeam = numberTeam;
    }

    public TeamLeader() {
        numberTeam = 1;
    }

    public int getNumberTeam() {
        return numberTeam;
    }

    public void setNumberTeam(int numberTeam) {
        this.numberTeam = numberTeam;
    }

    @Override
    public String toString() {
        return "Developer: " + super.toString() + "numberTeam" + numberTeam;
    }
}
