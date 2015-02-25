package classes.lab8;

import java.util.Date;
import java.util.Random;

public abstract class Person {
    public static boolean directorExist;

    private String FirstName;
    private String LastName;
    private Date BirthDate;
    private Date HireDate;

    public Person() {
        FirstName = setFirstName();
        LastName = setLastName();
        BirthDate = RandomDate.setRandomBirthDate();
        HireDate = RandomDate.setRandomHireDate();
    }

    public String setFirstName() {
        Random random = new Random();
        return FirstNames.values()[random.nextInt(FirstNames.values().length)].toString();
    }

    public String setLastName() {
        Random random = new Random();
        return LastNames.values()[random.nextInt(LastNames.values().length)].toString();
    }

    public String getFullName() {
        return this.FirstName + " " + this.LastName;
    }

    @Override
    public String toString() {
        return "FullName = " + getFullName() +
                ", BirthDate = " + BirthDate +
                ", HireDate =  " + HireDate +
                '}';
    }
}
