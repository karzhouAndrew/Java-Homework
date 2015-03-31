package classwork.plants.Park;

import classwork.plants.entity.Plant;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Leonid on 29.03.2015.
 */
public class Gardener {

    public void grow(Node plant) {
        double temp;
        if ("height".equals(plant.getNodeName())) {
            temp = Double.valueOf(plant.getTextContent()) + (int) (Math.random() * 10);
            plant.setTextContent(String.valueOf(temp));
        }
        if ("age".equals(plant.getNodeName())) {
            temp = Double.valueOf(plant.getTextContent()) + (int) (Math.random() * 5);
            plant.setTextContent(String.valueOf(temp));
        }


    }

    public String totalPlantHeight(List<Plant> plantList) {
        double totalPlantHeight = 0;
        for (Plant plant : plantList) {
            totalPlantHeight += plant.getHeight();
        }
        return String.valueOf(totalPlantHeight);
    }

    public Map<String, Integer> countOfPlants(List<Plant> plantList) {
        Map<String, Integer> mapPlantsByClassification = new HashMap<String, Integer>();
        for (Plant plant : plantList) {
            String classification = plant.getClassification();
            if (mapPlantsByClassification.get(classification) != null) {
                Integer count = mapPlantsByClassification.get(classification)+1;
                mapPlantsByClassification.put(classification,count);
            }else {
                mapPlantsByClassification.put(classification, 1);
            }
        }

        return mapPlantsByClassification;
    }
}
