package workbook.classwork.emloyeeDatabase;

public class Developer extends Employee {
    private Technology tech;
    private String currentProject;

    public Developer(Technology tech) {
        this.tech = tech;
        this.currentProject = "none";
        System.out.println(this);
    }

    public Project startNewProject(String projectName) {
        this.currentProject = projectName;
        System.out.println(this.getFullName() + " started project " + projectName);
        return new Project(projectName, this);
    }

    public Technology getTech() {
        return tech;
    }

    public void setTech(Technology tech) {
        this.tech = tech;
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }

    @Override
    public String toString() {
        return "Developer " + getFullName() +
                ", tech=" + tech +
                ", birth date " + (getBirthDate().getYear()+1900) +
                ", hired " + getEmployDate() +
                ", currentProject: '" + currentProject + '\'';
    }
}
