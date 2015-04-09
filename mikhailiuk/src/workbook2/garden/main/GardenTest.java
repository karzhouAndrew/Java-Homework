package workbook2.garden.main;

import workbook2.garden.Parser.Parser;
import workbook2.garden.Parser.ParserFactory;
import workbook2.garden.entity.Garden;
import workbook2.garden.entity.Plant;

import java.io.File;
import java.util.List;

/**
 * импортировать инфу о парковых растениях, определить иерархию, посадить парк, посчитать число насаждений и их общую высоту.
 * результаты экспортировать в XML.
 */
public class GardenTest {
    public static void main(String[] args) {
        Parser parser = new ParserFactory().createParser("SAX");
        List<Plant> plantList = parser.parse(new File("./mikhailiuk/src/workbook2/garden/entity/garden.xml"));
        Garden garden = new Garden(plantList);
        garden.gardenService(garden);
        garden.writeGarden(garden);
    }
}
