package added.lab13;

import java.util.Date;

/**
 * Created by vasilevich on 10.03.2015.
 */
public class User {
    private String firstName;
    private String lastName;
    private Date birhtDay;
    private String userID;

    public User(String firstName, String lastName, Date birhtDay, String userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birhtDay = birhtDay;
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirhtDay() {
        return birhtDay;
    }

    public String getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birhtDay=" + birhtDay +
                "}\n";
    }
}
