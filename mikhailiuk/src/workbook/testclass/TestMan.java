package workbook.testclass;

/**
 * Created by Natashka on 12.02.2015.
 */
public class TestMan {
    public static void main(String[] args) {
        Man man1 = new Man();
        Man man2 = new Man(25, "Ivan");
        int age1 = man1.getAge();
        String name1 = man1.getName();
        int age2 = man2.getAge();
        String name2 = man2.getName();
        System.out.println("Age 1 " + age1 + " Name 1 " + name1);
        System.out.println("Age 2 " + age2 + " Name 2 " + name2);
        ChangeOfMan changer1 = new ChangeOfMan();
        changer1.change(man1, 18, "Alex");
        System.out.println("Age 1 " + man1.getAge() + " Name 1 " + man1.getName());
    }
}
