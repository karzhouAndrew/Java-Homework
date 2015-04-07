package workbook.classwork.emloyeeDatabase;

import java.util.Calendar;
import java.util.Date;

public abstract class Employee {
    public static boolean directorAlreadyHired;

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date employDate;

    public Employee() {
        this.firstName = setFirstName();
        this.lastName = setLastName();
        this.birthDate = setBirthDate();
        this.employDate = setEmployDate();
    }

    public String setFirstName() {
        return FirstNames.values()[(int) (Math.random() * FirstNames.values().length)].toString();
    }

    public String setLastName() {
        return LastNames.values()[(int) (Math.random() * LastNames.values().length)].toString();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date setBirthDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(setRandYear(1975, 18), setRandMonth(), setRandDay());
        return calendar.getTime();
    }

    public Date getEmployDate() {
        return employDate;
    }

    public Date setEmployDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(setRandYear(2008, 7), setRandMonth(), setRandDay());
        return calendar.getTime();
    }

    public String getFullName() {
        return this.firstName.toUpperCase() + " " + this.lastName.toUpperCase();
    }

    public static int setRandYear(int minYear, int intervalOfYears) {
        return (int)(Math.random()*intervalOfYears) + minYear;
    }

    public static int setRandMonth() {
        return (int)(Math.random()*1000)%12;
    }

    public static int setRandDay() {
        return (int)(Math.random()*1000)%28;
    }
}
