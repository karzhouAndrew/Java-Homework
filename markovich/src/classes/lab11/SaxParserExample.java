package classes.lab11;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import static classes.lab11.PlantUnit.*;

/**
 * XML/Parsers
 * Парк
 * <p/>
 * Импортировать из XML-файла информацию о парковых растениях. Определить иерархию деревьев и кустарников. Посадить парк.
 * Посчитать число насаждений и их общую высоту. Результаты экспортировать в XML-файл.
 * <p/>
 * ТРЕБОВАНИЯ:
 * 1.	Приложение должно быть разработано на: С++, С# или Java (предпочтительно).
 * 2.	Парсинг XML-документов осуществлять одним из парсеров: DOM, SAX или StAX.
 * 3.	При кодировании должны быть использованы соглашения об оформлении кода для соответствующего языка – code convention.
 * 4.	Грамотно использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 * 5.	Не использовать графический интерфейс! Приложение должно быть консольным.
 * 6.	Взаимодействие с консолью или консольное меню должно отсутствовать или быть минимальным.
 * 7.	На интервью приносить на флеш-носителе исходный код.
 * 8.	(*) По возможности использовать design patterns GoF, но если не сможете объяснить детали применения, то лучше обойтись без них.
 */

public class SaxParserExample {

    private static String PATH = "markovich/src/classes/lab11/";
    private static double growthPeriod = 2.1;

    public static void main(String argv[]) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            InputStream xmlInput = new FileInputStream(PATH + "garden.xml");

            SAXParser saxParser = factory.newSAXParser();
            SaxHandler handler = new SaxHandler();
            saxParser.parse(xmlInput, handler);

            List<Plant> plantList = handler.plantList;

            System.out.println("Total plants - " + plantsCounter(plantList));
            System.out.println("Total height plants - " + plantsHeightAmount(plantList));

            growPlants(plantList, growthPeriod);

            System.out.println("-----------------------------------------------------------");
            System.out.println("Total plants after " + growthPeriod + " years - " + plantsCounter(plantList));
            System.out.println("Total height plants " + growthPeriod + " years - " + plantsHeightAmount(plantList));

            ConverterDOM.convertToXMLDOM(PATH + "newGarden.xml", plantList);

        } catch (Throwable err) {
            err.printStackTrace();
        }
    }

    public static double getGrowthPeriod() {
        return growthPeriod;
    }

}
