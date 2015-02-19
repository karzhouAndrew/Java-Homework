package workbook.testclass;

/**
 * Created by Natashka on 12.02.2015.
 */
public class Man {
    private int age;
    private String name;

    public Man() {
        age = 40;
        name = "Pavel";
    }

    public Man(int age1, String name1) {
        age = age1;
        name = name1;
    }

    public void setAge(int age1) {
        age = age1;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name1) {
       name=name1;
    }

    public String getName() {
        return name;
    }
}
