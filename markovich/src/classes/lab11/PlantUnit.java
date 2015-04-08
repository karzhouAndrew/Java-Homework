package classes.lab11;

import java.util.List;

public final class PlantUnit {

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
            plant.grow();
        }
        return plantList;
    }
}
