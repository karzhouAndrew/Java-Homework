package workbook.company;

/**
 * Created by Natashka on 25.02.2015.
 */
public abstract class Employee {
    private String name;
    private String surname;
    private String birthDate;
    private String employmentDate;

    public Employee() {
    }

    public Employee(String name, String surname, String birthDate, String employmentDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.employmentDate = employmentDate;
    }

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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public abstract void recruit(Employee employee);

    public abstract void fire(Employee employee);

    public boolean equals(Employee e1, Employee e2) {
        return (e1.getName().equals(e2.getName()) && e1.getSurname().equals(e2.getSurname()) && e1.getBirthDate().equals(e2.getBirthDate()) && e1.getEmploymentDate().equals(e2.getEmploymentDate()));
    }
}
