package classes.lab8;

import java.util.Calendar;
import java.util.Random;

public abstract class Person {
    public static boolean directorExist;

    private String firstName;
    private String lastName;
    private Calendar birthDate;
    private Calendar hireDate;

    public Person() {
        firstName = generateFirstName();
        lastName = generateLastName();
        birthDate = RandomDate.getRandomBirthDate();
        hireDate = RandomDate.getRandomHireDate();
    }

    public String generateFirstName() {
        Random random = new Random();
        return FirstNames.values()[random.nextInt(FirstNames.values().length)].toString();
    }

    public String generateLastName() {
        Random random = new Random();
        return LastNames.values()[random.nextInt(LastNames.values().length)].toString();
    }

    public String getFullName() {
        return this.firstName + " " + this.firstName;
    }

    @Override
    public String toString() {
        return "FullName = " + getFullName() +
                ", BirthDate = " + RandomDate.getFormatRandomBirthDay(birthDate) +
                ", HireDate = " + RandomDate.getFormatRandomHireDay(hireDate);
    }
}
