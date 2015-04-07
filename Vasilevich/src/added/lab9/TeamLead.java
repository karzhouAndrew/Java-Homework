package added.lab9;

import java.util.Date;

/**
 * Created by Sam on 23.02.2015.
 */
public class TeamLead extends Developer {
    private int[] team;
    private int teamCount;

    public int[] getTeam() {
        return team;
    }

    public void setTeam(int[] team) {
        teamCount = team.length;
        this.team = new int[teamCount];
        this.team = team;
    }

    public int getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(int teamCount) {
        this.teamCount = teamCount;
        this.team = new int[teamCount];
    }

    public TeamLead(String firstName, String LastName, Date birthDate, Date recruitDate, TechDevelopmentSkills skill) {
        super(firstName, LastName, birthDate, recruitDate, JobType.TEAM_LEAD, skill);
    }

    public TeamLead(TechDevelopmentSkills skill, int teamCount) {
        super(skill);
        this.setTeamCount(teamCount);
    }

    @Override
    public String toString() {
        StringBuilder teamList = new StringBuilder();
        teamList.append(super.toString()).append("  team = (");
        for (int teamItem : team) {
            teamList.append(teamItem + 1).append(' ');
        }
        teamList.append(')');
        return (teamList.toString());
    }

}
