package classwork.database;

import java.util.Calendar;

import static classwork.database.FirstName.*;

/**
 * Created by Leonid on 27.02.2015.
 */
public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String birthDay;
    protected String dateOfEmployment;


    public Employee() {
        jobTitle();
        firstName = setName();
        lastName = setLastName();
        birthDay = setBirthDay();
        dateOfEmployment = setDateOfEmployment();
    }

    public void jobTitle() {
    }

    public String getName() {
        return firstName;
    }

    public String setName() {
        firstName = FirstName.values()[(int) (Math.random() * FirstName.values().length)].toString();
        System.out.println("Имя: " + firstName);
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String setLastName() {
        lastName = LastName.values()[(int) (Math.random() * LastName.values().length)].toString();
        System.out.println("Фамилия: " + lastName);
        return lastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String setBirthDay() {
        Calendar birthday = Calendar.getInstance();
        birthday.set((int) (Math.random() * 10) + 1980, (int) (Math.random() * 12) + 1, (int) (Math.random() * 29));
        String out = birthday.get(Calendar.DAY_OF_MONTH) + "." + birthday.get(Calendar.MONTH) + "." + birthday.get(Calendar.YEAR);
        System.out.println("Дата рождения: " + out);
        return out;

    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String setDateOfEmployment() {
        Calendar dateOfEmployment = Calendar.getInstance();
        dateOfEmployment.set((int) (Math.random() * 5) + 2010, (int) (Math.random() * 12) + 1, (int) (Math.random() * 29));
        String out = dateOfEmployment.get(Calendar.DAY_OF_MONTH) + "." + dateOfEmployment.get(Calendar.MONTH) + "." + dateOfEmployment.get(Calendar.YEAR);
        System.out.println("Дата принятия на работу: " + out);
        return out;
    }


}
