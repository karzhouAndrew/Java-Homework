package homework.lesson10.workersBase;

import java.util.Date;

public class Director extends Workers {
    private Date dateOfRecruitment;

    public Director() {
    }

    public Director(String name, String surname, Date dateOfRecruitment) {
        super(name, surname);
        this.dateOfRecruitment = dateOfRecruitment;
    }

    public Developer makeDeveloperWork(Developer developer) {
        developer.setUsingTechnology("Работает в блокноте =(");
  //      System.out.println("developer = " + developer.toString());

        return developer;
    }

    @Override
    public String toString() {
        return "Director{" + getName() + " " + getSurname() +'}';
    }
}
