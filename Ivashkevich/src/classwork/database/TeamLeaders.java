package classwork.database;

/**
 * Created by Leonid on 27.02.2015.
 */
public class TeamLeaders extends Employee {

    public void jobTitle() {
        System.out.println("\nРуководитель команды");
    }

    public TeamLeaders() {
        System.out.println("\nСостав разработчиков в команде");
        DevelopersBase developersBase = new DevelopersBase();
        developersBase.getDevelopersBaseCommand();

    }

}
