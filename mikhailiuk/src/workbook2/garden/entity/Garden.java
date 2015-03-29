package workbook2.garden.entity;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natashka on 24.03.2015.
 */
public class Garden {
    private List<Plant> garden;

    public Garden(List<Plant> garden) {
        this.garden = garden;
    }

    public Garden() {
        garden = new ArrayList<Plant>();
    }

    public List<Plant> getGarden() {
        return garden;
    }

    public void setGarden(List<Plant> garden) {
        this.garden = garden;
    }

    public void gardenService(Garden garden) {
        List<Plant> plantList = garden.getGarden();
        double totalHeight = 0.0;
        for (Plant plant : plantList) {
            totalHeight += plant.getHeight();
            System.out.println(plant.toString());
        }
        System.out.println("Количество растений в саду: " + plantList.size() + ", их общая высота: " + totalHeight);
    }

    public void writeGarden(Garden garden) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("newGarden.xml");
            XMLEncoder encoder = new XMLEncoder(fileOutputStream);
            encoder.writeObject(garden.getGarden());
            encoder.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
