package workbook.classwork.collections.task10_3;

import java.util.Calendar;
import java.util.Date;

public class User {

    private static int idNumber = 0;

    private String firstName;
    private String secondName;
    private Date birth;
    private String id;

    public User() {
        this.firstName = setRandomFirstName();
        this.secondName = setRandomSecondName();
        this.birth = setRandomBirth();
        this.id = secondName.substring(0, 1).toLowerCase() + ++idNumber;
    }

    public User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birth = setRandomBirth();
        this.id = secondName.substring(0, 1).toLowerCase() + ++idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String setRandomFirstName() {
        this.firstName = FirstNames.values()[(int)(Math.random() * FirstNames.values().length)].toString();
        return this.firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String setRandomSecondName() {
        this.secondName = SecondNames.values()[(int) (Math.random() * SecondNames.values().length)].toString();
        return this.secondName;
    }

    public Date getBirth() {
        return birth;
    }

    public String getId() {
        return id;
    }

    public Date setRandomBirth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(setRandYear(1975, 18), setRandMonth(), setRandDay());
        this.birth = calendar.getTime();
        return this.birth;
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

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birth=" + "19" + birth.getYear() +
                ", id='" + id + '\'';
    }
}
