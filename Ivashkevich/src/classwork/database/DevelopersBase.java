package classwork.database;

/**
 * Created by Leonid on 02.03.2015.
 */
public class DevelopersBase {

    private String[] listOfDevelopers;

    public String[] getDevelopersBaseCommand() {
        int developersCount = 5;
        String[] array = new String[developersCount];
        for (int i = 0; i < developersCount; i++) {
            Developers developers = new Developers();
            array[i] = (developers.getName() + " " + developers.getLastName() + ",");
            listOfDevelopers = array;
        }
        return listOfDevelopers;
    }

}

