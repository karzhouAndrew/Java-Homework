package workbook.lab26;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 */
public class Pupil {
    private String name;
    private String surName;
    private int grade;

    public Pupil() {
        name = (new GeneratorName()).getName();
        surName = (new GeneratorSurName()).getSurName();
        grade = (new GeneratorGrade()).getGrade();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", mark=" + grade +
                '}';
    }
}
