package workbook.classwork.emloyeeDatabase;

public class Director extends Employee {
    public Director() {
        if (! directorAlreadyHired) {
            System.out.println(this);
            directorAlreadyHired = true;
        } else {
            System.out.println("   <<<   You can't hire another one director!   >>>");
        }
    }

    public void priceTheProject(Project project) {
        if (project.isProjectIsReady()) {
            int cost = (int)(Math.random() * 1000 / 1 * 100) ;
            project.setProjectCost(cost);
            System.out.println("   <<<   " + project.getProjectName() + " costs $" + project.getProjectCost() + "   >>>");
        } else {
            System.out.println("   <<<   Shit!!! " + project.getProjectName() + " is not ready yet! Wtf? " + project.getProjectDeveloper().getFullName() + ", you fired, asshole!!!   >>>");
            this.fireEmployee(project.getProjectDeveloper());
        }
    }

    public void fireEmployee(Employee employee) {
        System.out.println(employee.getFullName() + " is fired");
    }

    public Developer hireDeveloper() {
        return new Developer(Technology.values()[(int) (Math.random() * Technology.values().length)]);
    }

    public Manager hireManager() {
        return new Manager();
    }

    public TeamLeader hireTeamLeader() {
        return new TeamLeader();
    }

    @Override
    public String toString() {
        return "Director " + getFullName() +
                ", birth date " + (getBirthDate().getYear()+1900) +
                ", hired " + getEmployDate();
    }
}
