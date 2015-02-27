package workbook.company;

/**
 * Created by Natashka on 25.02.2015.
 */
public class People {
    private String[] names = {"Jack", "Paul", "John", "Bob", "Jim"};
    private String[] surnames = {"Daniels", "Beam", "Jameson", "Walker", "Dewar"};
    private String[] birthDates = {"01.01.1970", "02.02.1980", "03.03.1990", "04.04.1975", "05.05.1985"};
    private String[] employmentDates = {"02.02.2015", "03.02.2015", "04.02.2015", "05.02.2015", "06.02.2015"};

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String[] getSurnames() {
        return surnames;
    }

    public void setSurnames(String[] surnames) {
        this.surnames = surnames;
    }

    public String[] getBirthDates() {
        return birthDates;
    }

    public void setBirthDates(String[] birthDates) {
        this.birthDates = birthDates;
    }

    public String[] getEmploymentDates() {
        return employmentDates;
    }

    public void setEmploymentDates(String[] employmentDates) {
        this.employmentDates = employmentDates;
    }
}
