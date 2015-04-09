package added.lab9;

import java.util.Date;

/**
 * Created by Sam on 23.02.2015.
 */
public class Developer extends Employee {
    private TechDevelopmentSkills skill;

    public TechDevelopmentSkills getSkill() {
        return skill;
    }

    public void setSkill(TechDevelopmentSkills skill) {
        this.skill = skill;
    }

    public Developer(String firstName, String lastName, Date birthDate, Date recruitDate, JobType jobType, TechDevelopmentSkills skill) {
        super(firstName, lastName, birthDate, recruitDate, jobType);
        this.skill = skill;
    }

    public Developer(TechDevelopmentSkills skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return (super.toString() + "    skill = " + skill);
    }
}
