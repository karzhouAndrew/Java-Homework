package workbook.lab26;

import java.util.Random;

public class Student {
    private String name;
    private int mark;

    public Student() {
        this.name = generateFirstName();
        this.mark = randBetween(0,10);
    }

    private String generateFirstName() {
        Random random = new Random();
        return Names.values()[random.nextInt(Names.values().length)].toString();
    }

    private int randBetween(int min, int max) {
        return min + (int) Math.round(Math.random() * (max - min));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
