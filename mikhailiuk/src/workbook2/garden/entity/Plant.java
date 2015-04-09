package workbook2.garden.entity;

import java.util.List;
import java.util.Random;

/**
 * Created by Natashka on 24.03.2015.
 */
public class Plant {
    private String name;
    private int age;
    private double height;

    public Plant(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Plant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public List<Plant> plant(List<Plant> listOfPlants, Plant plant) {
        Random random = new Random();
        int plantQuantity = random.nextInt(10);
        for (int i = 0; i < plantQuantity; i++) {
            listOfPlants.add(plant);
        }
        return listOfPlants;
    }
}
