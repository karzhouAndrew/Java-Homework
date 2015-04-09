package workbook.company;

/**
 * Created by Natashka on 25.02.2015.
 */
public class TeamLead extends Employee {
    Employee[] team = new Developer[3];


    public Employee[] getTeam() {
        return team;
    }

    public void setTeam(Employee[] team) {
        this.team = team;
    }

    @Override
    public void recruit(Employee employee) {
        int i=0;
        while (i<team.length) {
            if (team[i] == null) {
                team[i] = employee;
                return;
            }
            i++;
        }
    }

    @Override
    public void fire(Employee employee) {
        for (Employee developer : team) {
            if (developer.getName() == employee.getName()) {
                developer.setName(null);
                developer.setSurname(null);
                developer.setBirthDate(null);
                developer.setEmploymentDate(null);
                return;
            }
        }
    }
}
