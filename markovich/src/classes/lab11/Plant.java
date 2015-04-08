package classes.lab11;

public class Plant {

    private String name;
    private double age;
    private double height;

    public Plant() {
    }

    public Plant(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void grow() {
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height;
    }
}
