package workbook2.workbook2Tasks.parser.blinovTask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manipulations {

    public static int plantCount(List<Plant> plantList) {
        return plantList.size();
    }

    public static double plantHeightSum(List<Plant> plantList) {
        double sum = 0;
        for (Plant plant : plantList) {
            sum += plant.getHeight();
        }
        return sum;
    }

    public static List<Plant> grow(List<Plant> plantList, int monthQuantity) {
        for (int i = 0; i < plantList.size(); i++) {
            double heightIncrement = 0;
            Plant plant = plantList.get(i);
            if (plant.getClass().equals(Tree.class)){
                heightIncrement = (double)(monthQuantity) * Tree.growMetresPerYear / 12;
            } else if (plant.getClass().equals(Bush.class)){
                heightIncrement = (double)(monthQuantity) * Bush.growMetresPerYear / 12;
            }
            double newHeight = plant.getHeight() + heightIncrement ;
            plant.setHeight(newHeight);
            double newAge = plant.getAge() + monthQuantity/12;
            plant.setAge(newAge);
        }
        return plantList;
    }

    public static void convertToXML(List<Plant> plantList, String newFileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(newFileName));
        bw.write("<?xml version = \"1.0\" encoding=\"utf-8\"?>\r\n");
        bw.write("<plants>\r\n");
        for (Plant plant : plantList) {
            if (plant instanceof Tree) {
                bw.write("\t<tree>\r\n");
                bw.write("\t\t<name>" + plant.getName() + "</name>\r\n");
                bw.write("\t\t<height>" + plant.getHeight() + "</height>\r\n");
                bw.write("\t\t<age>" + plant.getAge() + "</age>\r\n");
                bw.write("\t</tree>\r\n");
            } else if (plant instanceof Bush) {
                bw.write("\t<bush>\r\n");
                bw.write("\t\t<name>" + plant.getName() + "</name>\r\n");
                bw.write("\t\t<height>" + plant.getHeight() + "</height>\r\n");
                bw.write("\t\t<age>" + plant.getAge() + "</age>\r\n");
                bw.write("\t\t<berries>" + ((Bush) plant).getBerries() + "</berries>\r\n");
                bw.write("\t\t<inflorescence>" + ((Bush) plant).getInflorescence() + "</inflorescence>\r\n");
                bw.write("\t</bush>\r\n");
            }
        }
        bw.write("</plants>\r\n");
        bw.close();
    }
}
