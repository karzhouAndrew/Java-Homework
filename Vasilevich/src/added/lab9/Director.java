package added.lab9;


import java.util.Date;

/**
 * Created by vasilevich on 24.02.2015.
 */
public class Director extends Employee {

    public Director(String firstName, String lastName, Date birthDate, Date recruitDate) {
        super(firstName, lastName, birthDate, recruitDate, JobType.DIRECTOR);
    }

    public Director() {
    }
}
