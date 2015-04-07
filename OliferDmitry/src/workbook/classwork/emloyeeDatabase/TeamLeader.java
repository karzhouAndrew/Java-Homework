package workbook.classwork.emloyeeDatabase;

public class TeamLeader extends Employee {
    public TeamLeader() {
        System.out.println(this);
    }

    public void completeTheProject(Project project) {
        project.setProjectIsReady(true);
        System.out.println("   <<<   " + project.getProjectName() + " complited   >>>");
    }

    @Override
    public String toString() {
        return "Team leader " + getFullName() +
                ", birth date " + (getBirthDate().getYear()+1900) +
                ", hired " + getEmployDate();
    }
}
