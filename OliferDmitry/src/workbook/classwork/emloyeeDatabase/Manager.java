package workbook.classwork.emloyeeDatabase;

public class Manager extends Employee {
    public Manager() {
        System.out.println(this);
    }

    public void sellProject(Project project) {
        if (project.isProjectIsReady() && project.getProjectCost() > 0) {
            System.out.println("   <<<   " + this.getFullName() + " sold product " + project.getProjectName() + " (developed by " + project.getProjectDeveloper().getFullName() + ")   >>>");
        }
    }

    @Override
    public String toString() {
        return "Manager " + getFullName() +
                ", birth date " + (getBirthDate().getYear()+1900) +
                ", hired " + getEmployDate();
    }
}
