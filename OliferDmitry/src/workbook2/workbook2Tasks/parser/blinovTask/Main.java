/* ПАРК

 Импортировать из XML-файла информацию о парковых растениях.
 Определить иерархию деревьев и кустарников. Посадить парк.
 Посчитать число насаждений и их общую высоту.
 Результаты экспортировать в XML-файл.

 ТРЕБОВАНИЯ:
 1.	Приложение должно быть разработано на: С++, С# или Java (предпочтительно).
 2.	Парсинг XML-документов осуществлять одним из парсеров: DOM, SAX или StAX.
 3.	При кодировании должны быть использованы соглашения об оформлении кода для соответствующего языка – code convention.
 4.	Грамотно использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 5.	Не использовать графический интерфейс! Приложение должно быть консольным.
 6.	Взаимодействие с консолью или консольное меню должно отсутствовать или быть минимальным.
 7.	На интервью приносить на флеш-носителе исходный код.
 8.	(*) По возможности использовать design patterns GoF, но если не сможете объяснить детали применения, то лучше обойтись без них.

My "garden.xml" is:
<?xml version = "1.0" encoding="utf-8"?>
<plants>
	<tree>
		<name>Oak</name>
		<height>2.5</height>
		<age>2</age>
	</tree>
	<bush>
		<name>Rose</name>
		<berries>false</berries>
		<inflorescence>large pink</inflorescence>
		<age>1</age>
		<height>0.8</height>
	</bush>
	<tree>
		<name>Pine</name>
		<height>3</height>
		<age>1.5</age>
	</tree>
	<tree>
		<name>Maple</name>
		<height>2</height>
		<age>1.5</age>
	</tree>
	<bush>
		<name>Raspberry</name>
		<berries>true</berries>
		<height>1.1</height>
		<inflorescence>small white</inflorescence>
		<age>1</age>
	</bush>
</plants>
*/
package workbook2.workbook2Tasks.parser.blinovTask;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
import static workbook2.workbook2Tasks.parser.blinovTask.DOMParser.*;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        int monthInterval = 24;
        String fileName = "garden.xml";
        String newFileName = "new_garden.xml";

        List<Plant> plantList = parseXML(fileName);
        System.out.println("Garden:\n" + plantList + "\n");
        System.out.println("Total plants in your garden: " + plantCount(plantList));
        System.out.println("Total height of your plants: " + plantHeightSum(plantList) + " meters");

        plantList = grow(plantList, monthInterval);
        System.out.println("\nGarden " + monthInterval + " months later:\n" + plantList + "\n");
        System.out.println("Total height of your plants " + monthInterval + " months later: " + plantHeightSum(plantList) + " meters");
        convertToXML(plantList, newFileName);
    }
}
