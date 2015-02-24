package classwork.class4;

/**
 * Created by MTK on 23.02.2015.
 */
public class SalesManager extends Employee {
    private int numberTeam;

    public SalesManager(int numberTeam) {
        this.numberTeam = numberTeam;
    }

    public SalesManager() {
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
        return "SalesManager: " + super.toString() + " , numberTeam=" + numberTeam;
    }
}
