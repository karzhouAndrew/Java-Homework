package added.lab9;

import java.util.Date;

/**
 * Created by Sam on 23.02.2015.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date recruitDate;
    private JobType jobType;
    static private int employeeCounter = 0;
    final private int employeeID;


    public Employee(String firstName, String lastName, Date birthDate, Date recruitDate, JobType jobType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.recruitDate = recruitDate;
        this.jobType = jobType;
        employeeID = employeeCounter++;
    }

    public Employee() {
        employeeID = employeeCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getRecruitDate() {
        return recruitDate;
    }

    public void setRecruitDate(Date recruitDate) {
        this.recruitDate = recruitDate;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }


    public int getEmployeeID() {
        return employeeID;
    }

    private String getDateStr(Date date) {
        StringBuilder dateString = new StringBuilder();

        dateString.append((date.getYear() + 1900)).append('.').append(date.getMonth()).append('.').append(date.getDay());
        return dateString.toString();

    }

    @Override
    public String toString() {
        return firstName + " " + lastName + '(' + jobType + ")  (birth = " + getDateStr(birthDate) + ")  (start work = " + getDateStr(recruitDate) + ")   ";
    }
}
