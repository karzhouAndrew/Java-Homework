package classes.lab11;


import java.util.ArrayList;
import java.util.List;

public final class PlantUnit {
    public static List<Plant> mergePlants(List<Tree> treeList, List<Shrub> shrubList) {
        List<Plant> plantList = new ArrayList<Plant>();

        for (Tree tree : treeList) {
            plantList.add(tree);
        }

        for (Shrub shrub : shrubList) {
            plantList.add(shrub);
        }
        return plantList;
    }

    public static int plantsCounter(List<Plant> plantList) {
        return plantList.size();
    }

    public static double plantsHeightAmount(List<Plant> plantList) {
        double amount = 0;
        for (Plant plant : plantList) {
            amount += plant.getHeight();
        }
        return amount;
    }

    public static List<Plant> growPlants(List<Plant> plantList, double year) {

        for (Plant plant : plantList) {
            if (plant.getClass().equals(Tree.class)) {
                growTree(plant, year);
            } else if (plant.getClass().equals(Shrub.class)) {
                growShrub(plant, year);
            }
        }
        return plantList;
    }

    private static Plant growTree(Plant tree, double year) {
        Tree newTree = (Tree) tree;
        double heightRate = year * Tree.getHeightRatePerYear();
        double newHeight = newTree.getHeight() + heightRate;
        newTree.setHeight(newHeight);
        double newAge = newTree.getAge() + year;
        newTree.setAge(newAge);
        double trunkRate = Tree.getTrunkRatePerYear() * year;
        double newTrunk = newTree.getTrunk() + trunkRate;
        newTree.setTrunk(newTrunk);
        return newTree;
    }

    private static Plant growShrub(Plant shrub, double year) {
        double heightRate = year * Shrub.getHeightRatePerYear();
        double newHeight = shrub.getHeight() + heightRate;
        shrub.setHeight(newHeight);
        double newAge = shrub.getAge() + year;
        shrub.setAge(newAge);
        return shrub;
    }
}
