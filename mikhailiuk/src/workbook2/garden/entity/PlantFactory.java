package workbook2.garden.entity;

/**
 * Created by Natashka on 25.03.2015.
 */
public class PlantFactory {
    public Plant createPlant(String plantName,String attribute1, String attribute2) {
        if (plantName.equals("tree")) {
            return new Tree(attribute1,attribute2);
        } else if (plantName.equals("bush")) {
            return new Bush(attribute1,attribute2);
        }
        return new Plant();
    }
}