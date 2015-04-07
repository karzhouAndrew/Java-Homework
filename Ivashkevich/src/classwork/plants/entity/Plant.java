package classwork.plants.entity;

/**
 * Created by Leonid on 29.03.2015.
 */
public class Plant {
    private String classification;
    private String name;
    private Double height;
    private Double age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "classification='" + classification + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
