package added.lab9;

import java.util.Date;

/**
 * Created by vasilevich on 25.02.2015.
 */
public class SalesManager extends Employee {

    public SalesManager() {
    }

    public SalesManager(String firstName, String lastName, Date birthDate, Date recruitDate) {
        super(firstName, lastName, birthDate, recruitDate, JobType.SALES_MANAGER);
    }
}
