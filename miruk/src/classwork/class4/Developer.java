package classwork.class4;

/**
 * Created by Tonya on 24.02.2015.
 */
public class Developer extends Employee {
    private int numberTeam;
    private String technologys;

    public Developer(int numberTeam) {
        this.numberTeam = numberTeam;
    }

    public Developer() {
        numberTeam = 1;
        technologys =  TechnologyGenerator.generateTechnologys();
    }

    public int getNumberTeam() {
        return numberTeam;
    }

    public void setNumberTeam(int numberTeam) {
        this.numberTeam = numberTeam;
    }

    @Override
    public String toString() {
        return "Developer: " + super.toString() + " , numberTeam=" + numberTeam;
    }
}
