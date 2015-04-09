package workbook.company;

import java.util.Random;

/**
 * Created by Natashka on 25.02.2015.
 */
public class Manager extends Employee {

    @Override
    public void recruit(Employee employee) {
        People people = new People();
        Random random = new Random();
        String[] tempArr;
        tempArr = people.getNames();
        employee.setName(tempArr[random.nextInt(5)]);
        tempArr = people.getSurnames();
        employee.setSurname(tempArr[random.nextInt(5)]);
        tempArr = people.getBirthDates();
        employee.setBirthDate(tempArr[random.nextInt(5)]);
        tempArr = people.getEmploymentDates();
        employee.setEmploymentDate(tempArr[random.nextInt(5)]);
    }

    @Override
    public void fire(Employee employee) {
        employee.setName(null);
        employee.setSurname(null);
        employee.setBirthDate(null);
        employee.setEmploymentDate(null);
    }
}
