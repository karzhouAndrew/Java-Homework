package added.lab13;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

/**
 * Created by vasilevich on 10.03.2015.
 */
public class UserDB {
    private ArrayList<User> userDB = new ArrayList<User>();

    public void addUser(String firstName, String lastName, Date birthDate) {
        String userID = lastName.substring(0, 1) + userDB.size();

        userDB.add(new User(firstName, lastName, birthDate, userID));
    }

    public List<User> searchFistItemInLastName(String searchLetter) {
        List<User> returnUsers = new ArrayList<User>();
        for (User user : userDB) {
            if (user.getLastName().startsWith(searchLetter.toUpperCase())){
                returnUsers.add(user);
            }
        }
        return returnUsers;

    }

    public Set<User> orderUserByFirstName(){
        Set<User> users = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                int result = user1.getFirstName().compareTo(user2.getFirstName());
                if (result ==0) {
                    result = -1;
                }
                return result;
            }
        });

        users.addAll(userDB);
        return users;
    }

    public Set<User> orderUserByLastName(){
        Set<User> users = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                int result = user1.getLastName().compareTo(user2.getLastName());
                if (result ==0) {
                    result = -1;
                }
                return result;
            }
        });

        users.addAll(userDB);

        return users;
    }

    public Set<User> orderUserByBirthYear(){
        Set<User> users = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                int result = user1.getBirhtDay().getYear() - user2.getBirhtDay().getYear();
                if (result ==0) {
                    result = -1;
                }
                return result;
            }
        });

        users.addAll(userDB);

        return users;
    }

    @Override
    public String toString() {
        return "UserDB{\n" +
                "userDB=" + userDB +
                '}';
    }
}
