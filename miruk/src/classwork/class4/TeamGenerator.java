package classwork.class4;

public class TeamGenerator {

    public TeamGenerator(int numberTeam, int numberDeveloper, int numberSalesManager) {
        TeamLeader teamLeader = new TeamLeader(numberTeam);
        System.out.println(teamLeader.toString());

        for (int i = 0; i < numberDeveloper; i++) {
            Developer developer = new Developer(numberTeam);
            System.out.println(developer.toString());
        }
        for (int i = 0; i < numberSalesManager; i++) {
            SalesManager salesManager = new SalesManager(numberTeam);
            System.out.println(salesManager.toString());
        }
    }


}
