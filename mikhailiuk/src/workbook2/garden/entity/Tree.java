package workbook2.garden.entity;

/**
 * Created by Natashka on 24.03.2015.
 */
public class Tree extends Plant {
    private String leafType;
    private String fruitType;

    public Tree(String name, int age, double height, String leafType, String fruitType) {
        super(name, age, height);
        this.leafType = leafType;
        this.fruitType = fruitType;
    }

    public Tree(String leafType, String fruitType) {
        this.leafType = leafType;
        this.fruitType = fruitType;
    }

    public Tree() {
    }

    public String getLeafType() {
        return leafType;
    }

    public void setLeafType(String leafType) {
        this.leafType = leafType;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leafType='" + leafType + '\'' +
                ", fruitType='" + fruitType + '\'' + super.toString();
    }
}
