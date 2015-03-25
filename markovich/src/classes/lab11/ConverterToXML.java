package classes.lab11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ConverterToXML {
    public static void contertToXML(String fileName, List<Plant> plantList) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        bufferedWriter.write("<garden xmlns=\"http://www.w3schools.com\"\n" +
                "        xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "        xsi:schemaLocation=\"http://www.w3schools.com garden.xsd\">\n");
        for (Plant plant : plantList) {
            if (plant instanceof Tree) {
                bufferedWriter.write("\t<tree>\n");
                bufferedWriter.write("\t\t<name>" + plant.getName() + "</name>\n");
                bufferedWriter.write("\t\t<age>" + plant.getAge() + "</age>\n");
                bufferedWriter.write("\t\t<height>" + plant.getHeight() + "</height>\n");
                bufferedWriter.write("\t\t<trunk>" + ((Tree) plant).getTrunk() + "</trunk>\n");
                bufferedWriter.write("\t</tree>\n");
            } else if (plant instanceof Shrub) {
                bufferedWriter.write("\t<shrub>\n");
                bufferedWriter.write("\t\t<name>" + plant.getName() + "</name>\n");
                bufferedWriter.write("\t\t<age>" + plant.getAge() + "</age>\n");
                bufferedWriter.write("\t\t<height>" + plant.getHeight() + "</height>\n");
                bufferedWriter.write("\t\t<berries>" + ((Shrub) plant).isBerries() + "</berries>\n");
                bufferedWriter.write("\t\t<flowers>" + ((Shrub) plant).getFlowers() + "</flowers>\n");
                bufferedWriter.write("\t</shrub>\n");
            }
        }
        bufferedWriter.write("</garden>");
        bufferedWriter.close();
    }
}
