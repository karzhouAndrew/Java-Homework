package workbook.classwork.emloyeeDatabase;

public class Project {
    private String projectName;
    private int projectCost;
    private Developer projectDeveloper;
    private boolean projectIsReady;

    public Project(String projectName, Developer projectDeveloper) {
        this.projectName = setProjectName();
        this.projectCost = 0;
        this.projectDeveloper = projectDeveloper;
        this.projectIsReady = false;
    }

    public Project(String projectName, int projectCost, Developer projectDeveloper, boolean projectIsReady) {
        this.projectName = setProjectName();
        this.projectCost = projectCost;
        this.projectDeveloper = projectDeveloper;
        this.projectIsReady = projectIsReady;
    }

    public String getProjectName() {
        return projectName;
    }

    public String setProjectName() {
        return "-=" + ProjectNames.values()[(int) (Math.random() * ProjectNames.values().length)].toString() + "=-";
    }

    public int getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(int projectCost) {
        this.projectCost = projectCost;
    }

    public Developer getProjectDeveloper() {
        return projectDeveloper;
    }

    public void setProjectDeveloper(Developer projectDeveloper) {
        this.projectDeveloper = projectDeveloper;
    }

    public boolean isProjectIsReady() {
        return projectIsReady;
    }

    public void setProjectIsReady(boolean projectIsReady) {
        this.projectIsReady = projectIsReady;
    }
}
