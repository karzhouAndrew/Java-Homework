package workbook.lab26;

import java.util.Random;

public class GeneratorGrade {
    private int grade;

    public GeneratorGrade() {
        grade = generatorGrade();
    }

    public int generatorGrade() {
        Random random = new Random();
        int i = random.nextInt(9) + 2;
        return i;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
