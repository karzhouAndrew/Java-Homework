package classwork.class4;

public class TeamGenerator {

    public TeamGenerator(int numberTeam, int numberDeveloper, int numberSalesManager) {
        TeamLeader teamLeader = new TeamLeader(1);
        for (int i = 0; i < numberDeveloper; i++) {
            Developer developer = new Developer(1);
        }
        for (int i = 0; i < numberSalesManager; i++) {
            SalesManager salesManager = new SalesManager(1);
        }
    }
}
