package classwork.collections10_3.Objects;

/**
 * Created by Leonid on 06.03.2015.
 */
public class User {
    private String firstName;
    private String lastName;
    private String birthday;
    private String userIndex;


    public String getUserIndex() {
        return userIndex;
    }

    public void setUserIndex(String userIndex) {
        this.userIndex = userIndex;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        String day = "01";
        String month = "01";
        String year = "1900";
        birthday = birthday.trim();
        String[] date = birthday.split("[,:. ]+");
        if (date.length == 3) {
            day = date[0].trim();
            month = date[1].trim();
            year = date[2].trim();
        }
        this.birthday = day + "." + month + "." + year;
    }

}
