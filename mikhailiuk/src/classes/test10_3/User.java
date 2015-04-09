package classes.test10_3;

import java.util.Comparator;
import java.util.Random;

/**
 * Created by Natashka on 04.03.2015.
 */
public class User implements Comparator<User>, Comparable<User> {
    private String name;
    private String surname;
    private BirthDate birthDate;
    private String id;
    private static int number = 0;

    public User() {
        String[] names = {"Jack", "Paul", "John", "Bob", "Jim","William","Emmanuel","Richard"};
        String[] surnames = {"Daniels", "Beam", "Jameson", "Walker", "Dewar","Teacher","Grant","Courvoisier","Hennessy"};
        Random random = new Random();
        this.name = names[random.nextInt(7)];
        this.surname = surnames[random.nextInt(8)];
        this.birthDate = new BirthDate(random.nextInt(60) + 1940, random.nextInt(13), random.nextInt(30));
        this.id = surname.substring(0, 1) + number;
        number++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(BirthDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!id.equals(user.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int compareTo(User user) {
        if (this.name.compareTo(user.name)==0){
            return this.surname.compareTo(user.surname);
        }
        return this.name.compareTo(user.name);
    }

    @Override
    public int compare(User user1, User user2) {
        return user1.birthDate.getYear()-user2.birthDate.getYear();
    }
}
