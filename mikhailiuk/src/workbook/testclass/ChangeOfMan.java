package workbook.testclass;

/**
 * Created by Natashka on 12.02.2015.
 */
public class ChangeOfMan {
    public Man change(Man man, int age, String name) {
        man.setAge(age);
        man.setName(name);
        return man;
    }
}
