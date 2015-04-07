package classwork.plants.Park;

import classwork.plants.entity.Plant;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Leonid on 29.03.2015.
 */
public class Park {
    public List<Plant> plantPark(Document document) {

        Gardener gardener = new Gardener();
        Node root = document.getFirstChild();
        List<Plant> plantList = new ArrayList<Plant>();
        String classification = "";
        NodeList plantsList;
        for (int i = 0; i < document.getElementsByTagName("category").getLength(); i++) {
            NodeList categoryList = document.getElementsByTagName("category").item(i).getChildNodes();

            for (int k = 0; k < categoryList.getLength(); k++) {
                Node node = categoryList.item(k);
                if ("Title".equals(node.getNodeName())) {
                    classification = node.getTextContent();
                }
                if ("plant".equals(node.getNodeName())) {
                    plantsList = node.getChildNodes();
                    Plant plant = new Plant();
                    for (int j = 0; j < plantsList.getLength(); j++) {
                        Node plants = plantsList.item(j);

                        plant.setClassification(classification);
                        if ("name".equals(plants.getNodeName())) {
                            plant.setName(plants.getTextContent());

                        }
                        if ("height".equals(plants.getNodeName())) {
                            gardener.grow(plants);
                            plant.setHeight(Double.valueOf(plants.getTextContent()));

                        }
                        if ("age".equals(plants.getNodeName())) {
                            gardener.grow(plants);
                            plant.setAge(Double.valueOf(plants.getTextContent()));
                        }
                    }
                    plantList.add(plant);
                }
            }
        }

        Element totalPlantHeight = document.createElement("totalPlantHeight");
        totalPlantHeight.appendChild(document.createTextNode(gardener.totalPlantHeight(plantList)));
        root.appendChild(totalPlantHeight);

        for (Map.Entry entry : gardener.countOfPlants(plantList).entrySet()) {
            String tag = String.valueOf(entry.getKey());
            String value = String.valueOf(entry.getValue());
            Element element = document.createElement(tag);
            element.appendChild(document.createTextNode(value));
            root.appendChild(element);
            System.out.println("Class: " + entry.getKey() + ", countOfPlants: " + entry.getValue());
        }
        return plantList;
    }
}
