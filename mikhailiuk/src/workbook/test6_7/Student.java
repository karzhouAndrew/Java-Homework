package workbook.test6_7;

/**
 * Created by Natashka on 03.03.2015.
 */
public class Student {
    private String name;
    private String surname;
    private int mark;
    private String[] names = {"Jack", "Paul", "John", "Bob", "Jim"};
    private String[] surnames = {"Daniels", "Beam", "Jameson", "Walker", "Dewar"};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String[] getNames() {
        return names;
    }

    public String[] getSurnames() {
        return surnames;
    }

    public Student(String name, String surname, int mark) {
        this.name = name;
        this.surname = surname;
        this.mark = mark;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (mark != student.mark) return false;
        if (!name.equals(student.name)) return false;
        if (!surname.equals(student.surname)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + mark;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mark=" + mark +
                '}';
    }
}
