package homework.lesson10.workersBase;

/**
 * Created by Рома on 25.02.2015.
 */
public class Developer extends Workers {
    private String UsingTechnology;

    public Developer(String name, String surname, String usingTechnology) {
        super(name, surname);
        String usingTechnolog;
    }

    public String getUsingTechnology() {
        return UsingTechnology;
    }

    public void setUsingTechnology(String usingTechnology) {
        UsingTechnology = usingTechnology;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "UsingTechnology='" + UsingTechnology + '\'' +
                ", randomName=" + getName() + ", randomSurName=" + getSurname() +
                '}';
    }


}